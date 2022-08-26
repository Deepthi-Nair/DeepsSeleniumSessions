package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Otherlocators {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://demo-opencart.com/index.php?route=account/login");
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("test123");
ElementUtility ele=new ElementUtility(driver);
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
	     driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
	    // driver.findElement(By.linkText("Register")).click();
	     System.out.println("near link text");
	     By regLink=By.linkText("Register");
	     ele.doClick(regLink);
	     By tag=By.tagName("h1");
	     
	      String head = ele.getText(tag);
	      System.out.println(head);
	      
	}
	
	
		
	
	
}
