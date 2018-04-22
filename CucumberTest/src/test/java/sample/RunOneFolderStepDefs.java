package sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty",  //Pretty Format generates the Cucumber test report in the HTML format
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1+".json",
					}
					)



public class RunOneFolderStepDefs {
}