package MyTests;

import org.testng.annotations.Test;

public class DependsOnMethodConcepts {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login To App");
	}
	
	
	@Test(dependsOnMethods = "loginTest",priority = 1)
	public void homePageTest()
	{
		System.out.println("HomePage Test");
	}
	
	
	@Test(dependsOnMethods="homePageTest")
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	

}
