package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/");
		 driver.findElement(By.className("signin")).click();
		 driver.findElement(By.name("proceed")).click();
	     Thread.sleep(5000);
	     
	     Alert alert=driver.switchTo().alert();
	     String text=alert.getText();
	     if(text.equalsIgnoreCase("Please enter a valid user name"))
	     {
	    	 System.out.println("Valid alert");
	    	 }
	     else {
	    	 System.out.println("invalid alert");
	    	 }
	     alert.accept();
	    //alert.dismiss();
	     
	     driver.quit();
	}

}
