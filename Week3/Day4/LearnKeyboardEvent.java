package week3.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardEvent {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		Actions ac = new Actions(driver);
		ac.sendKeys(search, "Testleaf" + Keys.SHIFT + Keys.HOME)
		.pause(2000)
		.sendKeys(Keys.TAB).perform();
		ac.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN)
		.pause(2000)
		.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
		// step1: we have to choose our file type
		// webdriver :
		File scr = driver.getScreenshotAs(OutputType.FILE);
		// step 2 : we have to create a folder
		// File class-- name of the folder
		// name of the snapshot.image format
		File target = new File("./dragDrop/keyboad.png");
		// step 3 : we are merging the source file with the destination file
		// using the Apache.commons.io FileUtils
		FileUtils.copyFile(scr, target);
	}

}
