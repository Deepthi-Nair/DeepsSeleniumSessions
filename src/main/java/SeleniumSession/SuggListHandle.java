package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggListHandle {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
	  By search=By.id("search_query_top");
	  driver.findElement(search).sendKeys("Dress");
	  Thread.sleep(15000);
	  
	  List<WebElement> sugg=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
	  System.out.println("length of list is :"+sugg.size());
	  for (WebElement e: sugg) {
		  System.out.println("Getting the list");
		  if(e.getText().contains("Summer Dresses > Printed Summer "))
		  {
			  e.click();
			  System.out.println("clicked on casual dress");
			  break;
		  }
	  }
	  
	  //selectOptionfromSuggList("Printed");
	  driver.quit();
	  ////div[@class='ac_results']//li[contains(text(),'Summer Dresses > Printed Summer ')]
	  
	  
	  
	}
	public static void selectOptionfromSuggList(String value)
	{
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+value+"'"));
	}

}
