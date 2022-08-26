package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rtclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act= new Actions(driver);
		
	act.contextClick(rtclick).build().perform();
		List<WebElement> optList=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-icon')]/span"));
		
		for(WebElement e: optList)
	{
			System.out.println(e.getText());
			String text=e.getText();
			e.click();
			Thread.sleep(1000);
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
	    		alert.accept();
	    		act.contextClick(rtclick).build().perform();
				
//		if (text.equals("Copy"))
//			{
//				e.click();
//				Thread.sleep(5000);
//    			Alert alert1=driver.switchTo().alert();
//    			System.out.println(alert1.getText());
//  	    		alert1.accept();
//				break;			
//			}					
		}
		
//		
			}
		
	

}
