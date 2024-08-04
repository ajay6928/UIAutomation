package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageBase.ObjectDescription;
import PageBase.PageBase;
import Utils.TestBase;

public class GooglePage extends PageBase

{
	TestBase currentTest;
	
	public GooglePage(WebDriver driver , TestBase currentTest) {		
		super(driver);
		this.currentTest = currentTest;
		
	}
	
	ObjectDescription searchBar = new ObjectDescription("SearchBar","input", By.xpath("//textarea[@title='Search']"));
	ObjectDescription searchButton = new ObjectDescription("SearchButton","button", By.xpath("(//input[@value='Google Search'])[last()]"));
	
	
	public void enterTextIntoSearchBar() throws InterruptedException {
	enterText(searchBar, "value");		
	}
	
	public void clickOnSubmitButton() throws InterruptedException {
		objectClick(searchBar);
		
	}
	
	
	
}
