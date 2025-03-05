package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		// from where we can get this window handler name/address
		// driver.switchTo().window(null);
		// method 1
		String currentWindowAddress = driver.getWindowHandle();
		System.out.println("******* window Handler Name/id******");
		System.out.println(currentWindowAddress);
		System.out.println("Title of the window: " + driver.getTitle());
		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']/following-sibling::button"))
				.click();
		//System.out.println("Title of the window: " + driver.getTitle());
		// method 2
		Set<String> allOpenedWindowAddress = driver.getWindowHandles();
		List<String> shiftingDriverFocusTo = new ArrayList<String>(allOpenedWindowAddress);
		System.out.println("******* ALL window Handler Name/id******");
		for (String windowsName : allOpenedWindowAddress) {
			System.out.println(windowsName);
		}
		driver.switchTo().window(shiftingDriverFocusTo.get(1));
		System.out.println("Title of the child window: " + driver.getTitle());
		driver.switchTo().window(shiftingDriverFocusTo.get(0));
		driver.findElement(By.xpath("//h5[text()='Close all windows except Primary']/following-sibling::button"))
				.click();
		Set<String> allOpenedWindowAddressLatest = driver.getWindowHandles();
		List<String> shiftingDriverFocusToLatest = new ArrayList<String>(allOpenedWindowAddressLatest);
		System.out.println("******* ALL window Handler Name/id from the Latest driver instance******");
		for (String windowsNameLatest : allOpenedWindowAddressLatest) {
			System.out.println("________________");
			System.out.println(windowsNameLatest);
		}
		for (int i = 0; i < shiftingDriverFocusToLatest.size(); i++) {
			driver.switchTo().window(shiftingDriverFocusToLatest.get(i));
			System.out.println("Title of the window: "+driver.getTitle());
			 driver.close();
		}	
		//org.openqa.selenium.NoSuchWindowException
		// A) Parent B)Child
		// It closes the entire browser / it will close all the presently opened window
		// driver.quit();
			
		 
	}

}
