package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFotJSAlert {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/");
		 driver.findElement(By.className("signin")).click();
		 driver.findElement(By.name("proceed")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		 System.out.println(alert.getText());
		 
		 alert.accept();
		 
		
		 
	}
	
	public static Alert waitForAlert(int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeOut)
	{
		return waitForAlert(timeOut).getText();
		
	}
	
	
	public static void doAlertAccept(int timeOut)
	{
		 waitForAlert(timeOut).accept();
		
	}
	
	public static void doAlertDismiss(int timeOut)
	{
		 waitForAlert(timeOut).dismiss();
		
	}
	
	public static void emterAlertAccept(int timeOut,String text)
	{
		 waitForAlert(timeOut).sendKeys(text);
		
	}
	
	
	
	

}
