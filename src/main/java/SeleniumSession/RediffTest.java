package SeleniumSession;

public class RediffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil b= new BrowserUtil();
		b.launchBrowser("chrome");
		b.enterUrl("http://www.rediff.com");
		String title=b.getPageTitle();
		
		if(title.contains("rediff"))
		{
			System.out.println("Correct title");
		}
		String url= b.currentUrl();
		System.out.println("url is "+url);
		
		b.quitBrowser();
		

	}

}
