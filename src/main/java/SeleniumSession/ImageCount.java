package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {
public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		// List<WebElement> images=driver.findElements(By.tagName("img"));
		 
		 By img=By.tagName("img");
		 List<WebElement> images=doGetElements(img);
		 
		 System.out.println("Number of images are : "+images.size());
		 
		 for (WebElement e: images)
		 {
			 String altValue=e.getAttribute("alt");
			 String srcValue=	e.getAttribute("src");
			 
			 System.out.println("Atlvalue :"+altValue);
			 System.out.println("srcvalue :"+srcValue);
			 
		 }
		 driver.quit();
		 }
	
	public static List<WebElement> doGetElements(By locator)
	{
		return driver.findElements(locator);
	}

}
