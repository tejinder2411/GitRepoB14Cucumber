package sample.backgroundSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BackgroundStepDef {
	
	
	WebDriver driver =null;
	
	@Before(order=1)
	public void A(){
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("first before");
	}
	
	@Before(order=2)
	public void B(){
		
		System.out.println("second before");
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(userName);
		Thread.sleep(1000);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException{
		String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}
	
	
	@And("User enters user \"([^\"]*)\" surname")
	public void user_enters_user_surname(String surName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@But("User Mobile field should be blank")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	
	@Then("close browser")
	public void close_browser(){
		System.out.println("close the bro");
	}
	
	@When("^User enter user mailid$")
	public void user_enter_user_mailid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User enters following data$")
	public void user_enters_following_data(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
	
	@After(order=2)
	public void C(){
		driver.quit();
		driver =null;
	}
	
	@After(order=1)
	public void D(){
		
		System.out.println("second after");
	}
	
	
}
