package com.basic.multiplescenarioSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultipeScenarioStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver", "D:\\RADICALTeji\\NEW\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws InterruptedException{
		driver.findElement(By.name("firstname")).sendKeys("David");
		Thread.sleep(1000);
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws InterruptedException{
		String userNameActual =driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
		Thread.sleep(1000);
	}
	
	
	@And("User enters user surname")
	public void user_enters_user_surname() throws InterruptedException{
		driver.findElement(By.name("lastname")).sendKeys("Rogers");
		Thread.sleep(1000);
	}
	
	@Then("User Mobile field should be blank")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual =driver.findElement(By.name("reg_email__")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	
	@Then("close browser")
	public void close_browser(){
		driver.quit();
		driver =null;
	}
	
	
}
