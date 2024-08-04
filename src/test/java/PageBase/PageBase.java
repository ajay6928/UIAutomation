package PageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
	
	private WebDriver driver;
	private WebElement element;
	
public PageBase() {
		
	}
	
	public PageBase(WebDriver driver) {		
		this.driver = driver;
	}
	
	
	public void objectClick(ObjectDescription description) throws InterruptedException {
		driver.findElement(description.locator).sendKeys(Keys.ENTER);;
		Thread.sleep(1000);
	}
	
	public void enterText(ObjectDescription description , String text) throws InterruptedException {		
		driver.findElement(description.locator).sendKeys(text);
		Thread.sleep(1000);
		
	}
	
	public String objectGetValue(ObjectDescription desctription) {
		
		return driver.findElement(desctription.locator).getText();
	}
	

}
