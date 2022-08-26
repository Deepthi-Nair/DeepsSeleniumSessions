package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	
		public static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/contact-sales/");
			
//			
//			WebElement fName=driver.findElement(By.id("Form_submitForm_FullName1"));
//			fName.sendKeys("Deeps");
			
			By formFields=By.className( "text1");
			int fieldCount=driver.findElements(formFields).size();
			if(fieldCount==0)
			{
				System.out.println("form fields not available");
				}
			
			else {
				System.out.println("Form fields are available");
			}
			
			driver.quit();

	}

}
