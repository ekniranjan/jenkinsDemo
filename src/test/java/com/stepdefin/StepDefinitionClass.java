package com.stepdefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	WebDriver driver;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions(); //ops.setBinary("/Applications/Google Chrome Beta.app/Contents/MacOS/Google Chrome Beta"
		   ops.addArguments("--remote-allow-origins=*"); 
		   driver = new ChromeDriver(ops);
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
	}
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("testingName");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("testingName");
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
	}
	@Then("User verifies home page is displayed")
	public void user_verifies_home_page_is_displayed() {
		
		System.out.println("Success");
	}
	



	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String string, String string2) {
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(string);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(string2);
	}

	@Then("User verifies error message is displayed")
	public void user_verifies_error_message_is_displayed() {
		System.out.println("Error message");
	}




}
