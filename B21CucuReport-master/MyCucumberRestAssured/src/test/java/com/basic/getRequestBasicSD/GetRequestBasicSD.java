package com.basic.getRequestBasicSD;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequestBasicSD {
	Response res;
	
	@Given("^race circuit application is running$")
	public void race_circuit_application_is_running()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("application ready to use");
	}

	@When("^I hit get request to get response$")
	public void i_hit_get_request_to_get_response()  {
	    // Write code here that turns the phrase above into concrete actions
		 res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");  
		String actualData = res.getBody().asString();
		System.out.println("Data =    "+actualData);
		
		}

	@Then("^I validate circuit\"([^\"]*)\" value as \"([^\"]*)\" present$")
	public void i_validate_circuit_value_as_present(String jPath,String valueTobevalidated)  {
	    // Write code here that turns the phrase above into concrete actions
	   String attrValue = res.body().jsonPath().getString(jPath);
	   Assert.assertTrue(attrValue.equals(valueTobevalidated));
	}
	
	@Then("^I validate circuit id value$")
	public void i_validate_circuit_id_value() {
	    // Write code here that turns the phrase above into concrete actions
	    String totalValue = res.body().jsonPath().getString("MRData.total");
	    int totalIntV = Integer.parseInt(totalValue);
	    	    
	    for(int i =0;i<totalIntV;i++) {
	    	
	    	String idValue = res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
	    	if(idValue.equals("americas")) {
	    		Assert.assertTrue(idValue.equals("americas"));	
	    		break;
	    	}else {
	    		
	    	if(i==totalIntV-1) {
	    		
	    		Assert.assertTrue(false);
	    	}
	    }
	    
	}


}}
