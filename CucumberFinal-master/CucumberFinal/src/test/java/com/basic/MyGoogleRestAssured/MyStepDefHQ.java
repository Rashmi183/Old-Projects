package com.basic.MyGoogleRestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepDefHQ {
	
	
	WebDriver driver;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","C:\\Radical Software\\geckodriver-v0.18.0-win64\\geckodriver.exe" );
		 driver = new FirefoxDriver();

	}
	
	@When("^Launch selenium HQ site$")
	public void Launch_selenium_HQ_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://selenium.dev");
		
	}  

	@When("^I click on Downloads in selenium HQ application$")
	public void I_click_on_Downloads_in_selenium_HQ_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//nav/a[contains(text(),'Downloads')]")).click();
		
	}

	@Then("^I validate Downloads page is open$")
	public void I_validate_Downloads_page_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Assert.assertTrue(driver.getCurrentUrl().contains("Downloads"));
	}
	
}
