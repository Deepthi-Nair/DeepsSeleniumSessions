package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsConcepts {
	
	/**
	 * 
	 * 
	 * BeforeSuite=---connection---
BeforeTest----create user---
BeforeClass-----Lauunch Browser---

BeforeMethod------Logging to App---
@Test---Account info Test
After Method---Logout

BeforeMethod------Logging to App---
@Test-----User info test
After Method---Logout

After class----Close Browser
After Test----Delete User
After suite---Disconnect DB
	 */
	
	
	
	
	@BeforeSuite
    public void DBConnection()
    {
		System.out.println("BeforeSuite=---connection---");
    }
	
	@BeforeTest
	 public void createUser()
	    {
			System.out.println("BeforeTest----create user---");
	    }

	
	@BeforeClass
	 public void launchBrowser()
    {
		System.out.println("BeforeClass-----Lauunch Browser---");
    }
	
	@BeforeMethod
	 public void loginToApp()
	    {
			System.out.println("BeforeMethod------Logging to App---");
	    }
	
	
	@Test
	
	public void userinfoTest()
	{
		System.out.println("@Test-----User info test");
	}
	
	@Test
	public void accountInfoTest()
	{
		System.out.println("@Test---Account info Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method---Logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("After class----Close Browser");
	}
	
	@AfterTest
	public void  deleteUSer()
	{
		System.out.println("After Test----Delete User");
	}
	
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("After suite---Disconnect DB");
	}
	
}
