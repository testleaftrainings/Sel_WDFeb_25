package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOne extends CommonBase {
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	driver  = new ChromeDriver();	//anana63833hdhd
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as_demosalesmanager(String uname) {
		System.out.println(uname);
		driver.findElement(By.id("username")).sendKeys(uname);

	}
	@When("the user enters the password as {string}")
	public void the_user_enters_the_password_as_crmsfa(String pword) {
		System.out.println(pword);
		driver.findElement(By.id("password")).sendKeys(pword);

	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("the user should be redirected to welcome page")
	public void the_user_should_be_redirected_to_welcome_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("TestLeaf"),"Title verification failed" );

	}
	@Then("the user should view the welcome message")
	public void the_user_should_view_the_welcome_message() {
		String welcomeText = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		Assert.assertTrue(welcomeText.contains("Welcome"),"welcome text verification failed" );
	}
	
	@When("the user should not redirected to welcome page")
	public void the_user_should_not_redirected_to_welcome_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("TestLeaf"),"Login Title verification failed" );

	}
	

}
