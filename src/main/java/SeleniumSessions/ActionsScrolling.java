package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.get("https://www.macys.com/");
		
		//partial scrolling
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(3000);
		
//		scroll to footer and back to top of page
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		
//		scroll to element
		
		act.scrollToElement(driver.findElement(By.linkText("Privacy Policy")))
			.pause(300)
			.click(driver.findElement(By.linkText("Privacy Policy")))
			.perform();
	}

}
