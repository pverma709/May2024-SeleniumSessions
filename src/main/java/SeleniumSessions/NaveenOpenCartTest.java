package SeleniumSessions;

public class NaveenOpenCartTest {

	public static void main(String[] args) {
		
		BrowserUtility brUt = new BrowserUtility();
		
		brUt.launchDriver(" FireFox ");
		brUt.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUt.getPageTitle());
		System.out.println(brUt.getCurrentPageURL());
		brUt.quitBrowser();
		

	}

}
