package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestSetup setup;
	WebDriver driver ;
	static int count = 1;
	
	public Hooks(TestSetup setup) throws Exception {
		this.setup = setup;
		driver = setup.drverManager.applicationWebDriver();
		
	}
	
	@After
	public void driverQuit() {
		setup.drverManager.driver.quit();
	}
	
	
	@AfterStep
	public void captureScreen(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			String name = "Screenshot " + ++count;
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		    byte[] bytes = FileUtils.readFileToByteArray(file);
			scenario.attach(bytes, "image/png", name );
		}
	}

}
