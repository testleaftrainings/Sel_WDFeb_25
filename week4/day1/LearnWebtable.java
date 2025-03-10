package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebtable {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> countOfRow = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr"));
		int sizeOfTheRow = countOfRow.size();
		System.out.println("sizeOfTheRow :" + sizeOfTheRow);
		List<WebElement> countOfColumn = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td"));
		int sizeOfTheColumn = countOfColumn.size();
		System.out.println("sizeOfTheColumn :" + sizeOfTheColumn);
		for (int i = 1; i <= sizeOfTheRow; i++) {
			for (int j = 1; j <= sizeOfTheColumn; j++) {

				WebElement dynamicData = driver.findElement(
						By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[" + i + "]/td[" + j + "]"));
				String data = dynamicData.getText();
					System.out.print("|" + data + "|");
				}
			
			System.out.println();
		}
	}
}
