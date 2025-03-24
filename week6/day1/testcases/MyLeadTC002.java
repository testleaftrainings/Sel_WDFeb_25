package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MyLeadTC002 extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		
		System.out.println("driver value for runCreateLead() is "+driver);
		             //// kdldk03033ldkd9
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRM()
		.clickLead()
		.clickCreateLeadMenu();
		

	}

}
