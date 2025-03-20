package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class StepDefTwo extends CommonBase {
	
	@When("the user clicks the crmsfa link")
	public void the_user_clicks_the_crmsfa_link() {
		System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("the user clicks the leads menu")
	public void the_user_clicks_the_leads_menu() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("the user clicks the create lead")
	public void the_user_clicks_the_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("the user enters the company name as (.*)$")
	public void the_user_enters_the_company_name_as(String string) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(string);
	}
	@When("the user enters the first name as (.*)$")
	public void the_user_enters_the_first_name_as(String string) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(string);	    
	}
	@When("the user enters the last name as (.*)$")
	public void the_user_enters_the_last_name_as(String string) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(string);
	
	}
	    
	@When("the user enters the phone number as (.*)$")
	public void the_user_enters_the_phone_number_as(String string) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(string);
	}
	@When("the user clicks the create lead button")
	public void the_user_clicks_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

}
