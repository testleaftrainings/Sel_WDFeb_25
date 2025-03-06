package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		WebElement dragDrop = driver.findElement(By.id("form:conpnl_header"));
		Actions ac = new Actions(driver);
		//clickAndHold
		ac.clickAndHold(dragDrop).moveByOffset(400, 0).release(dragDrop)
		.pause(2000)
		.clickAndHold(dragDrop).moveByOffset(-400, 0).release(dragDrop)
		.perform();
		ac.dragAndDropBy(dragDrop, 200, 0).perform();
		WebElement origin = driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.id("form:drop_content"));
		ac.dragAndDrop(origin, target).perform();
	}
}
