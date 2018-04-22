package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void ssss(){
		System.setProperty("webdriver.chrome.driver", "D:\\RADICALTeji\\NEW\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opening URL");
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name(){
		driver.findElement(By.name("firstname")).sendKeys("David");
		
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present(){
		String userNameActual =driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
	}
	
	
}
