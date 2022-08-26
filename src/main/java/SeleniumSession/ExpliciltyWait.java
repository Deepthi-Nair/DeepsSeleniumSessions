package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpliciltyWait {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
	    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		By name=By.name("username");
		By pw=By.name("password");
		doPresenceOfElementlocated(name,10).sendKeys("Test123");
		doSendkeys("Testpw", pw, 10);
		doPresenceOfElementlocated(pw, 10, 2000);
		
		
		//WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(name));
		//ele.sendKeys("Test123");
	}
	public static WebElement doPresenceOfElementlocated(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static void doSendkeys(String val,By locator, int time)
	{
		doPresenceOfElementlocated(locator, time).sendKeys(val);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page. This does notnecessarily mean that the element is visible.
Parameters:locator used to find the elementReturns:the WebElement once it is located
	 * @param locator
	 * @param timeOut
	 * @param intervalTime
	 * @return
	 */
	
	public static WebElement doPresenceOfElementlocated(By locator, int timeOut, long intervalTime)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
	 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/**An expectation for checking that an element is present on the DOM of a page and visible.Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
Parameters:locator used to find the elementReturns:the WebElement once it is located and visible
	*/
	
	
	public static WebElement isElementVisible(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static WebElement isElementVisible(By locator,int timeOut, long intervalTime)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut),Duration.ofSeconds(intervalTime));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static List<WebElement> isElementsVisible(By locator,int timeOut, long intervalTime)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut),Duration.ofSeconds(intervalTime));
	   return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	
	public static List<WebElement> isElementsVisible(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	   return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	
	public static List<String> getElementsTextWithWait(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
		
	
	   List<WebElement>ele=  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		List <String> texts=new ArrayList<String>();
		for (WebElement e:ele) {
			String text=e.getText();
			texts.add(text);
			
		}
		return texts;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
