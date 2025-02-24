package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		// web driver methods: Maximize the browser 

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(1000);
		
		// web driver methods close():   close the current window		
		driver.close();

	}

}
