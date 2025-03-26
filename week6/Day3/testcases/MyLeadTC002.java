package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MyLeadTC002 extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		
		System.out.println("driver value for runCreateLead() is "+getRd());
		new LoginPage()
		.enterUserName("democsr")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRM()
		.clickLead()
		.clickCreateLeadMenu();
	}
}
