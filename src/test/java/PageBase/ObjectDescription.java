package PageBase;

import org.openqa.selenium.By;

public class ObjectDescription {
	
	public String name;
	public String type;
	public By locator;
	
	public ObjectDescription(String name , String type , By locator) {
		this.name = name;
		this.type = type;
		this.locator = locator;
		
	}

}
