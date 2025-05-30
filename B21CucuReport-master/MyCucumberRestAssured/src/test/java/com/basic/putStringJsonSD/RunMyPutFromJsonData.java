package com.basic.putStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/basic/putStringJsonFF/"},
		glue= {"com/basic/putStringJsonSD/"},
		monochrome = true
			
		)
		
				

public class RunMyPutFromJsonData {


}
