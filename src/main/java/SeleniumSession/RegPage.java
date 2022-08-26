package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserUtil br= new BrowserUtil();
		WebDriver driver=br.launchBrowser("chrome");
		driver.get("https://demo-opencart.com/index.php?route=account/register");
		
		
		By fname= By.id("input-firstname");
		By lname= By.id("input-lastname");
		By eid= By.id("input-email");
		
		
		ElementUtility ele =new ElementUtility(driver);
		ele.doSendkeys(fname,"shelly" );
		ele.doSendkeys(lname, "kumar");
		ele.doSendkeys(eid, "shellykumar@gmail.com");
		
		Thread.sleep(5000);
		driver.close();
	}

}
