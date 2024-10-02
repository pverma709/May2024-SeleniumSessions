package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestedList {
	
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		By searchTextField = By.name("q");
		By serachSuggestions = By.xpath("//ul/li//div[contains(@class,'wM6W7d')]");
		
		ElementUtil eUtil = new ElementUtil(driver);
//		eUtil.doSendKeys(searchTextField, "Selenium");
//		eUtil.printElementsTextList(serachSuggestions);
//		System.out.println(eUtil.getElementsCount(serachSuggestions));
//			
//		
//		List<WebElement> ele = eUtil.getElements(serachSuggestions);
//		for(WebElement e : ele) {
//			String s = e.getText();
//			System.out.println(s);
//			if(s.contains("sulfide")) {
//				e.click();
//				break;
//				
//			}
//			
//		}
		
//		clickOnSuggestedSearch(searchTextField, serachSuggestions, "Selenium", "sulfide" );
//		element util method version of below method
		
//		eUtil.doClickOnSuggestedSearch(searchTextField, serachSuggestions, "Selenium", "sulfide"); // to test positive scenrio
//		eUtil.doClickOnSuggestedSearch(searchTextField, serachSuggestions, "`'''''''''''>", "sulfide"); // to test custom exception
		eUtil.doClickOnSuggestedSearch(searchTextField, serachSuggestions, "Selenium", "funny"); // to test negative scenrio of clickText

	}

	public static void clickOnSuggestedSearch(By searchField, By SuggestedList, String searchText, String clickText) throws InterruptedException {
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(searchField, searchText);
		Thread.sleep(3000);
		
		List<WebElement> ele = eUtil.getElements(SuggestedList);
		for(WebElement e : ele) {
			String s = e.getText();
			if(s.contains(clickText)) {
				System.out.println(s);
			e.click();
			break;
			}
		
		
	}
	
	
	}	
	
}
