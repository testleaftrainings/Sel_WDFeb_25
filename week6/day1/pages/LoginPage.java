package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
/*
 * 
	
	driver.findElement(By.className("decorativeSubmit")).click();
 */

public class LoginPage extends ProjectSpecificMethods {
	
	                     // abl37373gu83838
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		// global variable --> blue, local variable--> brown
		// abl37373gu83838 = abl37373gu83838;
	}

	public LoginPage enterUserName() {	
		// abl37373gu83838
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		// abl37373gu83838
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	
	public HomePage clickLogin() {
		// abl37373gu83838
		driver.findElement(By.className("decorativeSubmit")).click();
		                // abl37373gu83838
		return new HomePage(driver);

	}


	
	
	
	
	
	

}
