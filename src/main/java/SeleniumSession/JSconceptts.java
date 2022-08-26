package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSconceptts {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		JavascriptExecutorUtils jutil= new JavascriptExecutorUtils(driver);
	    String title= jutil.getTitlebyJS();
	    
	    jutil.generateAlert("This is my pop up");
	    String innerText=jutil.getPageInnerTextbyJS();
	    System.out.println(innerText.contains("google"));
	    
	}

}
