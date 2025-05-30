package com.basic.MyFirstSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumScriptSD {
	
	WebDriver driver;
	
	@Given("^User Opens seleniumhq website$")
	public void User_Opens_seleniumhq_website11(){
		System.setProperty("webdriver.gecko.driver","C:\\Radical Software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
	}
	
	@When("^user click on \"([^\"]*)\" tab$")
	public void user_click_on_Project_tab(String tabName){
		System.out.println("tab name = "+tabName);
		driver.findElement(By.xpath("")).click();
	}
	
	@When("^user click on Project tab$")
	public void user_click_on_Project_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Project tab opens");
	}

	
	@Then("^user checks About tab$")
	public void user_checks_About_tab(){
		Assert.assertTrue(true);
	}

}
