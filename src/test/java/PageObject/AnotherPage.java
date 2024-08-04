package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageBase.ObjectDescription;
import PageBase.PageBase;
import Utils.TestBase;

public class AnotherPage extends PageBase{
	
	TestBase currentTest;
	
	public AnotherPage(WebDriver driver , TestBase currentTest) {		
		super(driver);
		this.currentTest = currentTest;
		
	}
	
	ObjectDescription dictionaryWord = new ObjectDescription("LableName", "lable", By.xpath("//span[text()='value']"));
	
	
	public void getValueOfWord() {
		
		System.out.println(objectGetValue(dictionaryWord));
		
	}

}
