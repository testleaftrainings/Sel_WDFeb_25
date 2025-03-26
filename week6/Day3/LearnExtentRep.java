package week6.day3;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentRep {

	public static void main(String[] args) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
		String timeStamp = now.format(ofPattern);
		//Step 1: Set Physical Report Path
		String folderPath = System.getProperty("user.dir");
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(folderPath+"/report/"+timeStamp+"result.html");
		// To keep the history 
		//reporter.setAppendExisting(true);// if you are using the same result.html
		// it will shoot the null pointer exception
		//Step 2: Create ExtentReports Object
		ExtentReports reports = new ExtentReports();
		//step 3: Attach Reporter to ExtentReports
		reports.attachReporter(reporter);
		//Step 4: Create a Test & Assign Details
									// testname 				// testdescription
		ExtentTest test = reports.createTest("Leaftaps_Login","autentication of user credentials with valid data");
		test.assignAuthor("Bhuvanesh"); // testAuthor
		test.assignCategory("Smoke Test");//testCategory
		//Step 5: Add Test Logs (Pass/Fail Status)
		test.pass("username is entered successfully");
		test.pass("snapshot", MediaEntityBuilder.createScreenCaptureFromPath(folderPath+"/dragDrop/myntra.png").build());
		test.fail("password is not entered");
		test.pass("Login is clicked successfully");
		test.pass("Login is clicked successfully");
		//Step 6: Flush the Report (Mandatory)
		
		reports.flush();
	}

}
