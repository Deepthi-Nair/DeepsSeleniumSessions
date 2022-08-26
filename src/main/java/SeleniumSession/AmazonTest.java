package SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil b= new BrowserUtil();
		b.launchBrowser("chrome");
		b.enterUrl("http://www.amazon.com");
		String title=b.getPageTitle();
		
		if(title.contains("amazon"))
		{
			System.out.println("Correct title");
		}
		
		String url= b.currentUrl();
		System.out.println("url is "+url);
		
		b.quitBrowser();

	}

}
