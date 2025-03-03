package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		// managing my window 
		driver.manage().window().maximize();
		
		// manage my timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://leafground.com/input.xhtml");
		
		String text = driver.findElement(By.xpath("//h4[contains(text(),'Clear')]")).getText();
		System.out.println(text);
		List<WebElement> grpOfElements = driver.findElements(By.tagName("h5"));
		
		for (int i = 0; i < grpOfElements.size(); i++) {
			
			WebElement webElement = grpOfElements.get(i);
			String textInTheWebpage = webElement.getText();
			
			System.out.println(textInTheWebpage);
			
			
			
		}
		
		

	}

}
