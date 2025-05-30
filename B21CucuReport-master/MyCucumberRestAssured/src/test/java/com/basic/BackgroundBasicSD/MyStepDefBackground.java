package com.basic.BackgroundBasicSD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefBackground {
	
	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am at the LogIn Page");
	   
	}

	@When("^I enter id and password$")
	public void i_enter_id_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter login and password");
	 
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am able to LogIn ");
	 
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_search_for_Lenovo_Laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lenovo lapto search completed");
		 
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("laptop appears in the search result to the basket");
		 
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Added item is displayed on user basket");
		 
	}


}
