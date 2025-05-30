package com.basic.HeadersValidationSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersValidationSD {
	
	Response res;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Starting of the GET script");
	}

	@Then("^user checks header \"([^\"]*)\" have \"([^\"]*)\"value$")
	public void user_checks_header_have_value(String headerName, String headerValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    res = RestAssured.given().relaxedHTTPSValidation().get("https://reqres.in/api/users");
	    	String completeResponse = res.asString();
	    System.out.println("----------" +completeResponse);
	    Headers heds = res.getHeaders();
		String actualHeaderValue = heds.getValue("headerName");
		System.out.println(heds);
		Assert.assertTrue(actualHeaderValue.equals(headerValue));

	    
	}
}
	
	
	
	
	