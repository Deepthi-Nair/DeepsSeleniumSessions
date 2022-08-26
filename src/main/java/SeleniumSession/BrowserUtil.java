package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {
	public WebDriver driver;
	/**
	 * Method to launch a browser based on a browser name
	 * @param browser
	 * @return returns driver
	 */
	
	public WebDriver launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91966\\Downloads\\chromedriver_win32 101v\\chromedriver.exe");
		    driver = new ChromeDriver();
		    }
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.iexplore.driver", "C:\\Users\\91966\\Downloads\\chromedriver_win32 101v\\chromedriver.exe");
		    driver = new ChromeDriver();
		    }
		return driver;
		
	}
/**
 * this method is used to enter url
 * @param url
 */
		
	
	public void enterUrl(String url)
	{
		if (url==null) {
			System.out.println("url is not entered");
			return;
		}
		if(url.indexOf("http")==-1)
		{
			System.out.println("http is missing");
			return;
		}
		driver.get(url);
	}
	
	
	/**
	 * returns the current url
	 * @return
	 */
	public String currentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void closeBrowser()
	{
		 driver.close();
	}
	
	public void quitBrowser()
	{
		 driver.quit();
	}

}
