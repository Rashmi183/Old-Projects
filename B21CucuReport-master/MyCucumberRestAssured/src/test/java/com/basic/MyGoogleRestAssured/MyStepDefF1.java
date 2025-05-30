package com.basic.MyGoogleRestAssured;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class MyStepDefF1 {
	
	Response res;
	
	@Given("^open fb application$")
	public void open_fb_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I enter user name$")
	public void i_enter_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I hit login$")
	public void i_hit_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	}

	@Then("^I check i am logged in$")
	public void i_check_i_am_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			int actualStatCode = res.getStatusCode();
			System.out.println("actualStatCode ="+actualStatCode);
			Assert.assertTrue(200==actualStatCode);
		}
		
	}

	

