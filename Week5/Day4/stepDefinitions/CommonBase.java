package stepDefinitions;



import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;




public class CommonBase extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	 // value of the driver is null
	 @BeforeMethod
	 public void preCommon() {
		    driver  = new ChromeDriver();	
			System.out.println(driver);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    

	}
	 
	@AfterMethod
	public void postCondition() {
          driver.close();
	}

	

}
