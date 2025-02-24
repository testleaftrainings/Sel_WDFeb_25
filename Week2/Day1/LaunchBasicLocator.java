package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBasicLocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// web driver methods: Maximize the browser

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// webdriver method .sendKeys(): TO enter the value
		driver.findElement(By.id("username")).sendKeys("democsr");

		Thread.sleep(1000);
		// attribute value is duplicate
		// driver.findElement(By.className("inputLogin")).sendKeys("crmsfa");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// webdriver methods .click():
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM")).click();

		// to print the current window title : .getTitle()
		String title = driver.getTitle();
		System.out.println(title);

		// web driver methods close(): close the current window
		driver.close();

	}

}
