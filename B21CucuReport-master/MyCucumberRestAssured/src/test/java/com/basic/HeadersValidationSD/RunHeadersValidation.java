package com.basic.HeadersValidationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/HeadersValidationFF/"},
		glue={"com/basic/HeadersValidationSD/"}
				

		
		)

public class RunHeadersValidation {

}
