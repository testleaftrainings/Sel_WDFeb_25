package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectspecificMethods {
	WebDriver driver;
	@Parameters({"url","browser","username","password"})
	@BeforeMethod
	public void preCondition(String url,String browser,String user,String pass) {
		System.out.println(browser+"---using this browser, the testscript have been executed");
		System.out.println(user+"---using this username, the testscript have been executed");
		// cross browser testing 
		switch (browser) {
		case "edge":
			driver= new EdgeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		default:
			driver= new ChromeDriver();
			break;
		}		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	
	@AfterMethod
	public void postConditions() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}
	

}
