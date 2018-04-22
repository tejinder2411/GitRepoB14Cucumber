package com.basic.sharedataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					//dryRun=true,
					
					features= {"src/test/resources/com/basic/sharedataFF/"},
					glue={"com/basic/sharedataSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report9.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"
					}
			
			)
	
	public class RunShareDataTest {	
	

}
