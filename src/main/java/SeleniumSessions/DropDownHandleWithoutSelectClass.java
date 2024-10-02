package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	private static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		
//		List<WebElement> optionList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println(optionList.size());
//		
//		for(WebElement e : optionList) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				System.out.println("clicked India");
//				break;
//			}
////			System.out.println(text);
//			
//		}
//		selectByDropdownvalue(country, "Brazil");
	
	}
	
//	moved to elementUtil
	
//	public static void selectByDropdownvalue(By locator, String value) {
//		
//		List<WebElement> optionList = driver.findElements(locator);
//		System.out.println("total no of options " + optionList.size());
//		
//		for(WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals(value)) {
//				e.click();
//				System.out.println("clicked " + value);
//				break;
//			}
//		
//		
//	}
	
	
	
//	}	
	
	
	
}
