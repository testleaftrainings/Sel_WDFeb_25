package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		WebElement simpleAlert = driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button"));
		//selenium -->.click()
		simpleAlert.click();
		// webdriver we use to handle the alert
		Alert alert = driver.switchTo().alert();
		String simpleAlertMsg = alert.getText();
		System.out.println(simpleAlertMsg);
		Thread.sleep(3000);
		alert.accept();
		String simpleResult = driver.findElement(By.id("simple_result")).getText();
		System.out.println(simpleResult);
		WebElement dialogAlert = driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button"));
		//JS -->.click()
		driver.executeScript("arguments[0].click()", dialogAlert);
		String dialogAlertMsg = alert.getText();
		System.out.println(dialogAlertMsg);
		alert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.close();
	}
}
