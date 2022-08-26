package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91966\\Downloads\\chromedriver_win32 101v\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Google"))
				{
					System.out.println("Correct Title-Pass");
				}
		else {System.out.println("Incorrect Title-Fail");}
		
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		//System.out.println(driver.getTitle()); Session ID is null. Using WebDriver after calling quit()?
		

	}

}
