package week4.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	@BeforeSuite
	public void reportStarts() {
		System.out.println("Report has been startd here");
	}
	@AfterSuite
	public void reportClosed() {
		System.out.println("Report have been closed");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("chrome is opened here");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("chrome is closed here");
	}
	@BeforeClass
	public void loadUrl() {
		System.out.println("Navigate to LeatTaps Application");
	}
	@AfterClass
	public void clearCookies() {
		System.out.println("cookies have been cleared here");
	}
	@BeforeMethod
	public void refreshWebpage() {
		System.out.println("Page is reloaded");
	}
	@AfterMethod
	public void screenShot() {
		System.out.println("Snapshot is captured here");
	}
	@Test
	public void enterUsername() {
		System.out.println("demosalesmanager");
	}
	@Test
	public void enterPassword() {
		System.out.println("crmsfa");
	}
	@Test
	public void loginButtonClick() {
		System.out.println("Login button is clicked");
	}

}
