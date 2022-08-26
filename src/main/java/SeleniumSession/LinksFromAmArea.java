package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksFromAmArea {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in");
		 By langLink=By.xpath("//div[@id='SIvCob']/a");
		 clickOnElement(langLink, "മലയാളം");
		
	    
	}
	
	public static void clickOnElement(By locator,String text)
	{
		List<WebElement> langList =driver.findElements(locator);
	    System.out.println("lang list :"+langList.size());

	    for (WebElement e:langList)
	    {
	    	System.out.println(e.getText());
	    	if(e.getText().trim().equalsIgnoreCase(text))
	    	{
	    		e.click();
	    		break;
	    	}
	    }
	}

}
