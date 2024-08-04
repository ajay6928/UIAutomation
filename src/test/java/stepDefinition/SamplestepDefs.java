package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import PageObject.AnotherPage;
import PageObject.GooglePage;
import Utils.TestBase;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SamplestepDefs {
	
	   TestSetup frameworkSetup;
		WebDriver driver;
		TestBase currentTest;
		AnotherPage anotherPage;
		
		public SamplestepDefs(TestSetup setup) throws Exception {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			this.frameworkSetup = setup;     		
			System.out.println("><><><><><><><>" + frameworkSetup);
			driver = frameworkSetup.drverManager.applicationWebDriver();
			currentTest = frameworkSetup.currentTest;
			anotherPage = new AnotherPage(driver , currentTest);

		}

		@Then("User in home page in arya")
		public void user_in_home_page() throws InterruptedException {
			anotherPage.getValueOfWord();
			
			

		}

		

}
