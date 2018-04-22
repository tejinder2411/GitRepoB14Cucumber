package sample.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					//dryRun=true,
					
//					features= {"sample/backgroundFF/"},
//					glue={"sample/backgroundSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
