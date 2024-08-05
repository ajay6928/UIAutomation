package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import PageObject.GooglePage;
import Utils.DriverManager;
import Utils.TestBase;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTestStepDefs {
    TestSetup frameworkSetup;
	WebDriver driver;
	TestBase currentTest;
	GooglePage googlePage;
	
	public SampleTestStepDefs(TestSetup setup) throws Exception {
		
		this.frameworkSetup = setup;     		
		driver = frameworkSetup.drverManager.applicationWebDriver();
		currentTest = frameworkSetup.currentTest;
		googlePage = new GooglePage(driver , currentTest);

	}

	@Given("User in home page")
	public void user_in_home_page() throws InterruptedException {
		googlePage.enterTextIntoSearchBar();

	}

	@When("user clicks on a button")
	public void user_clicks_on_a_button() throws InterruptedException {
		googlePage.clickOnSubmitButton();
	//	assertTrue(false);
		Thread.sleep(1000);
	}

	@When("User is able to see login page")
	public void user_is_able_to_see_login_page() {
		
	}

	@Then("User is validated the validation")
	public void user_is_validated_the_validation() {
		System.out.println("Step 4");
	//	assertTrue(false);
		
	}

}
