package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcepts {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are : "+links.size());
		
		for (int i=0;i<links.size();i++)
		{
		String linkText=links.get(i).getText();
		if(!linkText.isBlank())
		System.out.println(linkText);
		}
		driver.quit();
	}

}
