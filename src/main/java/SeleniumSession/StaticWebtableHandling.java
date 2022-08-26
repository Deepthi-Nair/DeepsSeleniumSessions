package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebtableHandling {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		int rowsize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		int colsize= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(rowsize+" : "+colsize);
		
		String b4xpath = "//table[@id=\"customers\"]/tbody/tr[";
		
		String afterxpath="]/td[";
		
		By row= By.xpath("//table[@id=\"customers\"]/tbody/tr");
		By col=By.xpath("//table[@id=\"customers\"]/tbody/tr/th");
		printTable(row,col,b4xpath,afterxpath);
//		for (int i=2;i<=rowsize;i++)
//		{
//			//System.out.println(compPath);
//			String compPath=b4xpath+i+afterxpath;
//			String name=driver.findElement(By.xpath(compPath)).getText();
//			System.out.println(name);
//			
//		}
		
//		
	
		driver.close();

	}
	
	public static void printTable(By rowloc,By colloc,String bxpath, String axpath)
{
		int rowsize=driver.findElements(rowloc).size();
		int colsize= driver.findElements(colloc).size();
		for (int i=2;i<=rowsize;i++)
	{
			for(int j=1;j<=colsize;j++)
			{
				String xpath=bxpath+i+axpath+j+"]";
				//System.out.println(xpath);
				String rowVal=driver.findElement(By.xpath(xpath)).getText();
				System.out.print(rowVal+"  ");
			}
			System.out.println();
		}
	}

}
