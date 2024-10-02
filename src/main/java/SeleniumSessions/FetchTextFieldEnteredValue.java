package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldEnteredValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.findElement(By.id("input-email")).sendKeys("heheeh@heheh.com");
//		
//		String text = driver.findElement(By.id("input-email")).getAttribute("value");
//		
//		System.out.println(text);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("expedia");
//		driver.findElement(By.className("truncate")).sendKeys("expedia");
		
		
		String text1 = driver.findElement(By.name("q")).getAttribute("value");
		
		System.out.println(text1);
		
		

	}

}
