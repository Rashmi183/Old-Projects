package com.basic.BackgroundBasicSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features= {"src/test/resources/com/basic/BackgroundBasicFF/"},
	glue= {"com/basic/BackgroundBasicSD/"},
	monochrome = true,
	dryRun=false
	)

public class RunnerBackgroundTest {
	
	
}

