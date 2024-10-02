package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalAttributeTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		below approach without using elementUtil()
		
		List<WebElement> textFieldLists = driver.findElements(By.className("form-control"));
		
			for(WebElement ele : textFieldLists ) {
				
				String text = ele.getAttribute("placeholder");
				System.out.println(text);
				
			}
		
	}
	
	
	
	
	
	

}
