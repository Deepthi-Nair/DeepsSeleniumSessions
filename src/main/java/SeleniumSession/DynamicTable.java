package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	
		public static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.espncricinfo.com/series/england-in-netherlands-2022-1281442/netherlands-vs-england-1st-odi-1281444/full-scorecard");
			System.out.println("Wicket taker : "+getWicketTaker("Jason Roy"));
			System.out.print("*************");
			System.out.println();
			//driver.quit();
			System.out.println("Run score: "+scoreCard("Jason Roy"));
			System.out.println("*************");
		    System.out.println();
			System.out.println("Bowling score ");
			System.out.println("*************");
			System.out.println();
			 System.out.println();
			System.out.println(bowlingCard());
			driver.close();

	}
		
		public static String getWicketTaker(String pName)
		{
			String xpath ="//table[@class='ds-w-full ds-table ds-table-xs ds-table-fixed ci-scorecard-table']//a//span[contains(text(),'"+pName+"')]//ancestor::td//following-sibling::td/span";
		   // System.out.println(xpath);
			String wicketBy=driver.findElement(By.xpath(xpath)).getText();
			return wicketBy;
		}
		
		public static List<String> scoreCard(String pName)
		{
			String xpath ="//table[@class='ds-w-full ds-table ds-table-xs ds-table-fixed ci-scorecard-table']//a//span[contains(text(),'"+pName+"')]//ancestor::td//following-sibling::td";
		    List<WebElement> scoreList=driver.findElements(By.xpath(xpath));
		    List<String> scoreVal=new ArrayList<String>();
		    for (int i=0;i<scoreList.size();i++)
		    {
		    	String text=scoreList.get(i).getText();
		    	scoreVal.add(text);
		    	
		    }
		    return scoreVal;
		}
		
		public static List<String> bowlingCard()
		{
			String xpath ="//table[@class='ds-w-full ds-table ds-table-xs ds-table-fixed']/tbody/tr";
			List<WebElement> scoreList=driver.findElements(By.xpath(xpath));
		    List<String> scoreVal=new ArrayList<String>();
		    for (int i=1;i<scoreList.size();i++)
		    {
		    	String text=scoreList.get(i).getText();
		    	scoreVal.add(text);
		    	
		    }
		    return scoreVal;
			
		}
		
		

}
