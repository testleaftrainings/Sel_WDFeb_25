package hooksImplementation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinitions.CommonBase;

public class HooksImp extends CommonBase {
	
	 @Before
	 public void preCommon() {
		    driver  = new ChromeDriver();	
			System.out.println(driver);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    

	}
	 
	@After
	public void postCondition() {
          driver.close();
	}

}
