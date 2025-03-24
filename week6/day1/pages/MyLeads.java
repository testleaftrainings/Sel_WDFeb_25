package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeads  extends ProjectSpecificMethods{
	
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyLeads clickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return this;

	}

}
