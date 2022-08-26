package AppTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;




public class GooglTest extends BaseTestClass {
	
	
	
	@Test(priority = 1)
	public void searchTest()
	{
		boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
	

}
