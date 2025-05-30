package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features= {"src/test/resources/com/basic/MyGoogleRestAssured/MyFeatureFileHQ.feature"},
	glue= {"com/basic/MyGoogleRestAssured/MyStepDefHQ"},
	monochrome = true
		
	)

public class RunnerTest {
	
	
}

