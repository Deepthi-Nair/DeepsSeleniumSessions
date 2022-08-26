package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextUtil {

	
		public static WebDriver driver;
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				 driver.get("https://www.amazon.in/");
				// List<WebElement> images=driver.findElements(By.tagName("img"));
				 
				 By etext=By.tagName("a");
				// System.out.println(doGetElements(img));
				 System.out.println("Link count is : "+ getLinksCount(etext));
				 
				 
			 List<String> actList=getElementText(etext);
			 for (String e:actList)
			 
			 {
				 System.out.println(e);
			 }
			 
			 if(getElementText(etext).contains("Privacy Notice"))
			 {
				 System.out.println("----Contains Privacy Notice--------");
			 }
				driver.quit();

	}
			
			public static List<String> getElementText(By locator)
			{
				List<WebElement> eleList= doGetElements(locator);
				List<String> eleTextList= new ArrayList<String>();
				for (WebElement e: eleList)
				{
					String eletext=e.getText();
					if(!eletext.isBlank()) {
						eleTextList.add(eletext);
					
					}
				}
				return eleTextList;
			}
			
			
			public static int getLinksCount(By locator)
			{
				return doGetElements(locator).size();
			}
			public static List<WebElement> doGetElements(By locator)
			{
				return driver.findElements(locator);
			}
			


}
