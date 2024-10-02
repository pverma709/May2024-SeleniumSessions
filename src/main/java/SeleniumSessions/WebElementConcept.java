package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		create elemnet + perform action
		
//		Approcah - By locator + generic method for web elemenet and perform action
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		
//		doSendKeys(email, "testing@gmail.com" );
//		doSendKeys(pwd, "12345AAA");
		
//		better approach than above - By locator + generic method for web elemenet and perform action in a utility
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(email, "xxx@test.com");
		eUtil.doSendKeys(pwd, "cvcvcv");
	

	}
	
//below methods craeted for 1st apprach then moved to ElementUtil class
	
	public static void doSendKeys(By locator, String value) {
		
		getWebElement(locator).sendKeys(value);
		
	}
	
	public static WebElement getWebElement(By locator){
		
		return driver.findElement(locator);
		
		
	}
	

}
