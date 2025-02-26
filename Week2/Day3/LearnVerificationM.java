package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationM {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement checkBox = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]"));
		
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		if (checkBox.isSelected()==false) {
			checkBox.click();
		}
		
		
	}

}
