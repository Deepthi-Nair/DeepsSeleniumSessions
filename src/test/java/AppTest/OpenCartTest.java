package AppTest;

	import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class OpenCartTest extends BaseTestClass {

		
		@Test(priority = 1)
		public void urlTest()
		
		{
			//driver.get("https://demo.opencart.com");
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("opencart"));
			
		}
		@Test(priority = 2)
		public void contactSalesTest()
		{
			boolean flag=driver.findElement(By.linkText("My Account")).isDisplayed();
			Assert.assertTrue(flag);
			
		}
		
		
		
		
		
		
		
	}



