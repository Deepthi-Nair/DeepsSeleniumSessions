package MyTests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcepts {
	@Test(expectedExceptions = ArithmeticException.class)
	 public void LoginTest() {
		 
		 System.out.println(9/0);
		
	}

}
