package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownwithSelectTag {

	public static WebDriver driver;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
	By options=(By.id("searchDropdownBox"));
//	  
//		 Select select=new Select(options);
//		 select.selectByVisibleText("Amazon Fashion");
		  
		 ElementUtility ele= new ElementUtility(driver);
		 ele.doSelectByVal(options, "Amazon Fashion");
		 ele.doSelectByIndex(options, 6);
		 driver.quit();
		 
	 
		 
		 
	
	}
	

}
