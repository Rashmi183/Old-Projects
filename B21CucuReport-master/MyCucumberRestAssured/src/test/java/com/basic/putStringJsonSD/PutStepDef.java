package com.basic.putStringJsonSD;

import static org.hamcrest.Matchers.notNullValue;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutStepDef {
	
	Response resp ;
	@Given("^user hit the post request from json data$")
	public void user_hit_the_post_request_from_json_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{ \"name\": \"Surya\", \"job\":\"QA lead\"}").post("https://reqres.in/api/users");
//		resp.then().log().all();
//		resp.then().log().status();
		System.out.println("====="+resp.asString());
		System.out.println("status code is = "+resp.getStatusCode());
			
		
	}

	@Then("^user should validate the data is present$")
	public void user_should_validate_the_data_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
           resp.then().assertThat().body("id", notNullValue());
		
		//check id is greater than zero
		String idValue = resp.getBody().jsonPath().get("id");
		int idInt = Integer.parseInt(idValue);
		Assert.assertTrue(idInt > 0);
		
	}

	@Given("^user does put request from json data$")
	public void user_does_put_request_from_json_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{ \"name\": \"Suryansh\", \"job\":\"QA Manager\"}").put("https://reqres.in/api/users");
//		resp.then().log().all();
//		resp.then().log().status();
		System.out.println("====="+resp.asString());
		System.out.println("status code is = "+resp.getStatusCode());
		
	}

	@Then("^user should be able validate the data is updated$")
	public void user_should_be_able_validate_the_data_is_updated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
        //resp.then().assertThat().body("id", notNullValue());
        resp.then().assertThat().statusCode(200);
		//check id is greater than zero
		String idValue = resp.getBody().jsonPath().get("id");
		int idInt = Integer.parseInt(idValue);
		Assert.assertEquals(idInt,200);
		
		
	}


}
