package SeleniumSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsHelpers {
	public WebDriver driver=null;
	
	public ElementsHelpers(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getElements(By locator)
	{
	return driver.findElement(locator);
	
	}	
	
	public void sendkeys(By locator,String value)
	{
	 driver.findElement(locator).sendKeys(value);	
	}
	
}
