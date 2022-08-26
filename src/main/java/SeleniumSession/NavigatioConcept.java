package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatioConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91966\\Downloads\\chromedriver_win32 101v\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		driver.navigate().to("http://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();	
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		
		driver.navigate().refresh();
	}

}
