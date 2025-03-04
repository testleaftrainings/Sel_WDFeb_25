package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		//Using Index
		//driver.switchTo().frame(0);
		//org.openqa.selenium.NoSuchElementException
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//button[text()='Count Frames']")).getText());
		driver.switchTo().defaultContent();
		//Using WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		//Using id/name attribute
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	}

}
