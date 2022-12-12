package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class AmazonSearchSteps {
	WebDriver driver = null;
	@Given("user is on Amazon Homepage")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("Inside user is on Amazon Homepage.");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", 
				projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

	@When("user searches for a type of item in the amazon searchbar")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside user enters username and password.");
	}

	@When("user presses enter")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside clicks on login button.");
	}

	@Then("user is navigated to page containing search results")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside user is navigated to the home page");
	}
}
