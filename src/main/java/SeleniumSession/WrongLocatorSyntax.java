package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrongLocatorSyntax {


	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		By fname=By.xpath("//*[@id=\"Form_submitForm_FullName\"]");
		driver.findElement(fname).sendKeys("Deeps");
		
		driver.quit();

	}

}
