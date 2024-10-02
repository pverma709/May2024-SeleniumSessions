package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtility brUtil = new BrowserUtility();

		WebDriver driver = brUtil.launchDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());

		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By logo = (By.className("img-responsive"));

		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(email, "hahah@gmail.com");
		eUtil.doSendKeys(pwd, "vvvvvv");
		System.out.println(eUtil.isElementDisplayed(logo));

		brUtil.closeBrowser();

	}

}
