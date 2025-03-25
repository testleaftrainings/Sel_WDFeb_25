package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginTC001 extends ProjectSpecificMethods{
	
	@Test
	public void runLogin(){
		System.out.println("driver value for runLogin() is "+getRd());
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin();
	}
}
