package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginTC001 extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setTestcaseDetails() {
		filePath="Login";

	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username,String password){
		System.out.println("driver value for runLogin() is "+getRd());
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin();
	}
}
