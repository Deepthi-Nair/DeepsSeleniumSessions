package SeleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerDropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(5000);
		By choice=By.cssSelector("span.comboTreeItemTitle");
		//mySelectChoice(choice,"choice 2 3");
		//mySelectChoice(choice,"choice 1","choice 2 3","choice 6 2 1");
		mySelectChoice(choice, "all");
		
	}
	
	
	
	public static void mySelectChoice(By locator,String... ch)
	{
		List<WebElement> choicesList=driver.findElements(locator);
		if(!ch[0].equalsIgnoreCase("all"))
		{
	    for(WebElement e: choicesList)
	    	
	    {
	    	String text=e.getText();
	    	for(int i=0;i<ch.length;i++)
	    	{
	    		if(text.equalsIgnoreCase(ch[i]))
	    		{
	    			e.click();
	    			break;
	    		}
	    	//System.out.println(e.getText());
	    	
	    	}
		
	}
		}
		else {
			//all selection
			for (WebElement e: choicesList)
			{
				if(e.isDisplayed())
				{
				e.click();
				}
			}
		}

}
	
	
	
}
