package sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	WebDriver driver;
	
	
	@When("^Open Facebook home Page$")
	public void Open_Facebook_home_Page(){
		System.out.println("in 1st given");
		System.setProperty("webdriver.chrome.driver","D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters First Name$")
	public void user_enters_First_Name(){
		System.out.println("in when first name");
	}
	
	@And("^User enters Last Name$")
	public void userentersLastName(){
		System.out.println("in when last name");
	}
	
	@Then("^User Checks that User Name is properly Entered$")
	public void user_Checks_that_User_NameisproperlyEntered(){
		System.out.println("in when check name");
	}
	
	
	@But("^Surname field should remain blank$")
	public void Surname_field_should_remain_blank(){
		System.out.println("in when blank surname name");
		String s = driver.findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals("", "");
	}
	
	
	
	

}
