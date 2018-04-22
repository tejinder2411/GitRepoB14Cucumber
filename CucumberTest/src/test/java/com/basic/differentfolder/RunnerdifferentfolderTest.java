package com.basic.differentfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=true,
		features= {"src/test/resources/com/basic/differentfolderFF/"},
		glue={"com/basic/differentfolder/"}
		
		
		
		
		)

public class RunnerdifferentfolderTest {

}
