package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyLeads clickLead() {

		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);

	}
}
