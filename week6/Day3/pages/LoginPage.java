package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;
/*
 * 
	
	driver.findElement(By.className("decorativeSubmit")).click();
 */

public class LoginPage extends ProjectSpecificMethods {

	@When("the user enters the username as {string}")
	public LoginPage enterUserName(String uname) {	
		getRd().findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	@When("the user enters the password as {string}")
	public LoginPage enterPassword(String pname) {
		getRd().findElement(By.id("password")).sendKeys(pname);
		return this;
	}
	@When("the user clicks the login button")
	public HomePage clickLogin() {
		getRd().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}


	
	
	
	
	
	

}
