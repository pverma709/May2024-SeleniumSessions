package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysWithPause {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.get("https://www.macys.com/");
		
		//partial scrolling
		
				
		By firstName = By.xpath("//label[text()='First Name' and @class ='col-sm-2 control-label']");
		
		String name = "Naveen";
		char ch[] = name.toCharArray();
		
		Actions act = new Actions(driver);
		
		for(char c : ch) {
			act.sendKeys(driver.findElement(By.xpath("//label[text()='First Name' and @class ='col-sm-2 control-label']")), String.valueOf(c)).pause(300).perform();
			
		}
		
		
		

	}

}
