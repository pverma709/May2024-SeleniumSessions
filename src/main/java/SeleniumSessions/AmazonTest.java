package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtility brUtil = new BrowserUtility();
		
		brUtil.launchDriver("pooja ");
		brUtil.launchUrl("https://www.amazon.com/");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("test pass");
			
		}else {
			System.out.println("test fail");
		}
		
		
		System.out.println(brUtil.getCurrentPageURL());
		brUtil.closeBrowser();
		

	}

}
