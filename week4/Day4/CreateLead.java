package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateLead extends ProjectspecificMethods {

	// step 1: Create a method sendData() inside the CreateLead class
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		// step 2 :create 2-Dimensional array with number of rows and columns
		String data[][] = new String[3][4];
		// step 3 : Add all the sets of data into the array and make sure the index
		// starts from 0
		// row 0 - single set of data index-0
		data[0][0] = "Testleaf";
		data[0][1] = "Bhuvanesh";
		data[0][2] = "Moorthy";
		data[0][3] = "89123";
		// row 1 -single set of data index-1
		data[1][0] = "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "M";
		data[1][3] = "77123";
		// row 2 -single set of data index-2
		data[2][0] = "TCS";
		data[2][1] = "Hari";
		data[2][2] = "R";
		data[2][3] = "66123";
		// step 4 : Return the data back to the calling method
		return data;
		// step 5: Annotate that method with @DataProvider
	}

	// Receive this data in the test method

	// step 6 : dataProvider--->use dataprovider attibute the pipeline is created
	@Test(dataProvider = "fetchData")

	// step 7 : use that arguments inside the method.
	public void runCreateLead(String cname, String fname, String lname, String phno) throws InterruptedException {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		String extractedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		// Hard Assert
		// Assert.assertEquals(extractedCompanyName, cname, "the assertion error message
		// : Lead is not created using the expected companyName");

		// implementation --->SoftAssert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(extractedCompanyName, cname,
				"the assertion error message : Lead is not created using the expected companyName");

	}
}
