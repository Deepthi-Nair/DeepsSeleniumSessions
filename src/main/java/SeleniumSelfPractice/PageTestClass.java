package SeleniumSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserSetup br=new BrowserSetup();
		WebDriver driver=br.launchBrowser("chrome");
		driver.get("https://demo-opencart.com/index.php?route=account/register");
		
		System.out.println(driver.getTitle());
		
		By fname=By.id("input-firstname");
		By lname= By.id("input-lastname");
		By eid=By.id("input-email");
		By ph=By.id("input-telephone");
		By pw=By.id("input-password");
		By cpw=By.id("input-confirm");
		
		
		
		ElementsHelpers hlp=new ElementsHelpers(driver);
		hlp.sendkeys(fname, "Test");
		hlp.sendkeys(lname, "test");
		hlp.sendkeys(eid, "test@gmail.com");
		hlp.sendkeys(ph, "12435");
		hlp.sendkeys(pw, "test123");
		hlp.sendkeys(cpw, "test123");
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
