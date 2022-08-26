package SeleniumSelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public WebDriver driver;
	public WebDriver launchBrowser(String br)
	{
		if (br.equalsIgnoreCase("chrome"))
				{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			
				}
		
		else if (br.equalsIgnoreCase("ie"))
		{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	
		}
		else
		{
			System.out.println("Pass a valid browser");
		}
		return driver;
	}

}
