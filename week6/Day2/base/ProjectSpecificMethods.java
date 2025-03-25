package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethods  extends AbstractTestNGCucumberTests{
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	@BeforeMethod
	public void preConditon() {
		getRd().manage().window().maximize();
		getRd().get("http://leaftaps.com/opentaps/control/main");
		getRd().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void postCondition() {
		getRd().quit();
	}
	public  RemoteWebDriver getRd() {
		return rd.get();
	}
	public void setRd(RemoteWebDriver driver) {
		rd.set(driver);	
	}
	}


