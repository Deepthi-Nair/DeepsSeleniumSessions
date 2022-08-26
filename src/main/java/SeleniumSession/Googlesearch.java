package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 By searchBox= By.name("q");
		 driver.findElement(searchBox).sendKeys("Selenium");
		 
		 Thread.sleep(5000);
		 
		 By searchVal= By.xpath("//ul[@role=\"listbox\"]/li//div[@class=\"wM6W7d\"]");
		 
		 List<WebElement> sugg=driver.findElements(searchVal);
		 System.out.println(sugg.size());
		 
		 for (WebElement e:sugg)
		 {
			 System.out.println(e.getText());
			 if (e.getText().equalsIgnoreCase("selenium tutorial"))
			 {
				 e.click();
				 break;
			 }
		 }
		 
		 //driver.quit();
		 
	}
	
	
	

}
