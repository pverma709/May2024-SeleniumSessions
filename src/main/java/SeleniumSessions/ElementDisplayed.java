package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	
	// below code optimized and moved to ElementUtil class

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
		
		System.out.println(flag);
		

	}

}
