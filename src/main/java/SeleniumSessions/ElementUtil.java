package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver);
		
	}
	
	
	public WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator, CharSequence... value) {
		
		getElement(locator).sendKeys(value);
	}
	
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	public String getText(By locator) {
		
		String eleText = getElement(locator).getText();
		
		if( eleText!= null) {
			return eleText;
		}else {
			System.out.println("Element text is null "+ eleText);
			return null;
		}
		
	}
	
	 public boolean isElementDisplayed(By locator) {
		 
	try {
		 return getElement(locator).isDisplayed();
		 
	}catch(NoSuchElementException e ){
		System.out.println("Element not present - " + locator);
		return false;
	}
		 
		 
	 }
	 
	 
	 
	 public boolean isEnabled(By locator) {
		 
	try {	 
		 return getElement(locator).isEnabled();
	}catch(NoSuchElementException e) {
		System.out.println("element not enabled " + locator);
		return false;
	}
		 
	 }
	
	
	public boolean isSelected(By locator) {
		
	 try {
		return getElement(locator).isSelected();
	}catch(NoSuchElementException e) {
		System.out.println("element not selected "+ locator);
		return false;
	}
	 
	}
	
	public String getElementAttribute(By locator, String attributeName) {
		
		
			return getElement(locator).getAttribute(attributeName);
			
				
			
	}
	

	public List<WebElement> getElements(By locator){
		
		return driver.findElements(locator);
		
	}
		
		
	public int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}	
	
	
	public void printElementsTextList(By locator) {
	List<String> eleText = getElementsTextList(locator);
	
		for(String s : eleText){
			System.out.println(s);
	}
	
	}	
		
	
	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement wE : eleList){
			String text = wE.getText();
			if(text.length()!=0) {
			  eleTextList.add(text);
			}
			
		}
			return eleTextList;
		
		
		}
	
	
	
	public boolean doClickOnSuggestedSearch(By searchField, By SuggestedList, String searchText, String clickText) throws InterruptedException {
		
		boolean flag = false; // to handle scenario if clickText not found in serach list
		
		doSendKeys(searchField, searchText);
		Thread.sleep(3000);
		
			
		List<WebElement> ele = getElements(SuggestedList);
		int listSize = ele.size();
		System.out.println("Total no. of suggestions: "+ listSize);
//		we can write below code instead of above two lines
//			int size = getElements(SuggestedList).size();
		
		if(listSize == 0){
			System.out.println("No suggestions found");
			throw new FrameworkException("No suggestions found");
			
		}
		
		for(WebElement e : ele) {
			String s = e.getText();
			if(s.contains(clickText)) {
				System.out.println(s);
			e.click();
			flag = true;
			break;
			}
		}
		
		if(flag) {
			System.out.println(clickText + " found");
			return true;
		}
		else {
			System.out.println(clickText + " not found");
			return false;
		}
	
	
	}	
	
	//*********************select dropdown utils*************
	
	private Select getSelect(By locator) {
		return new Select(getElement(locator));
		
	}
	
	
	public int getSelectDropdownOptionsCount(By locator) {
		return getSelect(locator).getOptions().size();
	
	}
	
	public void selectDropdownvalueByVisibleText(By locator, String visibleText) {
		
		getSelect(locator).selectByVisibleText(visibleText);
		
	}
	
	public void selectDropdownValueByOptionValue(By locator, String optionValue) {
		getSelect(locator).selectByValue(optionValue);
		
	}
	
	public void selectDropdownValueByIndex(By locator, int index) {
		getSelect(locator).selectByIndex(index);
		
		
	}
	
// select dropdown value from dropdown without using select class and findElements()
	
	public void selectDropdownvalue(By locator, String value) {
		
		List<WebElement> optionsList = driver.findElements(locator);
		selectDropDown(optionsList, value);	
	
	
	}	
	

	// select dropdown value from dropdown using select class and getOptions()
	
	public void selectDropDownValueUsingSelect(By locator, String value) {
		
		List<WebElement> optionsList = getSelect(locator).getOptions();
		System.out.println("total no of options " + optionsList.size());
		
		selectDropDown(optionsList, value);				
			
	}	
	
	private void selectDropDown(List<WebElement> optionsList, String value) {
		
		for(WebElement e : optionsList ) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				System.out.println("clicked " + value);
				break;
			}
	}
	
	}
	
	public List<String> getDropDownOptionsTextList(By locator) {
		
		List<WebElement> optionsList = getSelect(locator).getOptions();
		System.out.println("total no of options " + optionsList.size());
		
		List<String> optionsListText = new ArrayList<String>();
		
			for(WebElement e : optionsList ) {
			String text = e.getText();
			optionsListText.add(text);
		}
		return optionsListText;
	}	
	
	
	
}
