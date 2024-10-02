package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.id("Form_getForm_Country");
		
		By countryOptionvalue = By.cssSelector("select#Form_getForm_Country option");
		
//		By countryOptionvalue = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		
		
		//single country
//		if(getDropDownOptionsTextList(country).contains("India")){
//				System.out.println("pass");
//			}
		
		
		
		//multiple country
		
////		List<String> expectedcountryList = Arrays.asList("Brazil", "India", "Japan");
////		if(getDropDownOptionsTextList(country).containsAll(expectedcountryList)) {
////			System.out.println("List there!");
////			
//		}
//		
//		System.out.println((getDropDownOptionsTextList(country)));
		System.out.println("**************");
		
		ElementUtil eUtil = new ElementUtil(driver);
//		System.out.println(eUtil.getSelectDropdownOptionsCount(country));
//		eUtil.selectDropDownValueUsingSelect(country, "India");
//		eUtil.selectDropdownValueByIndex(country, 5);
//		eUtil.selectDropdownValueByOptionValue(country, "Aruba");
//		eUtil.selectDropdownvalueByVisibleText(country, "Germany");
		
//		eUtil.selectDropdownvalue(countryOptionvalue, "Aruba");
		getDropdownOptionValue(countryOptionvalue);
		
	
	}
	
	public static List<String> getDropdownOptionValue(By locator) {
		

	 List<WebElement> options = driver.findElements(locator);
	 System.out.println(options.size());
	 List<String> optionsValueText = new ArrayList<String>();
		
		for(WebElement e : options) {
			String text = e.getAttribute("value");
			optionsValueText.add(text);
		}
		
		System.out.println(optionsValueText);
		return optionsValueText;
		
	}
	

	
	//moved below to elementUtil
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		List<String> optionsListText = new ArrayList<String>();
		
		
		
		
		for(WebElement e : optionsList ) {
			String text = e.getText();
			optionsListText.add(text);
		}
		return optionsListText;
	}	
	
	
	public static WebElement getElement(By locator) {
		
		 return driver.findElement(locator);
		
	}

}
