package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo-opencart.com/index.php?route=account/login");
        By emailid=By.id("input-email");
   /*     boolean flag=driver.findElement(emailid).isDisplayed();
      if (flag)
       {
	   System.out.println("element displayed");
	   }
	
	else 
		{
		System.out.println("element not displayed");
		}
		*/
        ElementUtility ele=new ElementUtility(driver);
        ele.doIsDisplayed(emailid);

}
}
	
	
