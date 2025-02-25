package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		//syntax to implement the select class
		Select options = new Select(selectDropdown);
		
		options.selectByIndex(3);
		
		Thread.sleep(1000);
		options.selectByVisibleText("Cypress");
		
		

	}

}
