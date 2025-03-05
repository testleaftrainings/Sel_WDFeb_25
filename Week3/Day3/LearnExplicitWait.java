package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		// Step 1:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// step 2:
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		// driver.getWindowHandles().size()= 3
		// excepted condition =2
		// 3==2--->false
		// org.openqa.selenium.TimeoutException
		if (until == true) {
			System.out.println("condition passed :" + until);
			driver.quit();
		} else {
			System.out.println("condition failed :" + until);

		}
	}

}
