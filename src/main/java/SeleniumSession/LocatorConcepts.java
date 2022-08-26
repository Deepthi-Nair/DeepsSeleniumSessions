package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo-opencart.com/index.php?route=account/login");
        
		//first approach
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
//		
		//second approach
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement pw=driver.findElement(By.id("input-password"));
//	    email.sendKeys("testemail@gmail.com");
//	    pw.sendKeys("test123");
		
		//third approach
		By email =By.id("input-email");
		By pw=By.id("input-password");
		
//		WebElement eid=driver.findElement(email);
//		WebElement pswrd=driver.findElement(pw);
//		eid.sendKeys("test");
//		
		doSendKeys(email,"app5@gmail.com");
		driver.quit();
			
	}
     public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}
     
     public static void doSendKeys(By locator, String value)
     {
    	 getElement(locator).sendKeys(value);
     }
     
    
}
