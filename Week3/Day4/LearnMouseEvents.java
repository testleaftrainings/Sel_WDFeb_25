package week3.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseEvents {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions action = new Actions(driver);
		action.
		moveToElement(driver.findElement(By.xpath("//a[text()='Men']")))
		.pause(3000)		
		.moveToElement(driver.findElement(By.xpath("//a[text()='Women']")))
		.pause(1000)
		.click(driver.findElement(By.xpath("//a[text()='Kurtas & Suits']")))
		.perform();
		// scrolling
		action.scrollByAmount(0, 2000).perform();
		// It will scroll till targetted webelement
		action.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).perform();
		WebElement element = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		File scr = element.getScreenshotAs(OutputType.FILE);
		File target = new File("./dragDrop/element.png");
		FileUtils.copyFile(scr, target);

	}

}
