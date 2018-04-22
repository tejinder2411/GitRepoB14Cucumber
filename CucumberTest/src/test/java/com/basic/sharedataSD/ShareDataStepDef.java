package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//PICOCONTAINER? ---> SHARED DATA
//used for dependency mgmt for all Step Def, creates dependent obj first and provide to STep Def
//B4 every scenario cucumber creates class


public class ShareDataStepDef {
	
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share){
		driver = share.setup();
	}
	
	
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException{
		driver.findElement(By.name("firstname")).sendKeys(userName);
		Thread.sleep(1000);
	}
	
	
	
	

	
	
	

	
	
}
