package com.basic.parameterizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					//dryRun=true,
					
					features= {"src/test/resources/com/basic/parameterizationFF/"},
					glue={"com/basic/parameterizationSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report8.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
					}
			
			)
	
	public class RunParameterizationTest {	
	

}
