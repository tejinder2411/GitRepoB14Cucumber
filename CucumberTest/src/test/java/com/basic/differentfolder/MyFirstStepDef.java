package com.basic.differentfolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\RADICALTeji\\NEW\\chromedriver.exe ");
		driver = new ChromeDriver();   
		driver.get("https://www.facebook.com");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
	}
	
	@Then("User checks user \"([^\"]*)\" first name is present")
	public void User_checks_user_first_name_is_present(String name){
		String userNameActual =   driver.findElement(By.name("firstname")).getAttribute("value");
		   Assert.assertEquals(name,userNameActual);
	}
	
	

}
