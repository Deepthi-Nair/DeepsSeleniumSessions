package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElements {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Contact us")).click();
      //   waitForurlToBe("http://automationpractice.com/index.php?controller=contact", 10);
        String expectedurl="controller=contact";
        System.out.println(driver.getTitle());
        boolean val=waitForurlToBe(expectedurl,5);
        System.out.println(driver.getTitle());
        System.out.println("value is "+val);
       if (waitForurlToBe(expectedurl, 5)) {
    	   System.out.println("url founbd and opened");
       }
        
	    
        
        
        
	}
	
	public static boolean waitForurlToBe(String urlFraction,int timeOut)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
	
	public static boolean waitForTiltleToBe(String titleFraction,int timeOut)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		return wait.until(ExpectedConditions.urlContains(titleFraction));
	}
	
	
	

}
