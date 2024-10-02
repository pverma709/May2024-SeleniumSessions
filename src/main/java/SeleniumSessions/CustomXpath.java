package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	private static WebDriver driver;
	public static void main(String[] args) {
	
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		text()
//		//htmltag[text()='value]'
//		//h1[text()='Register Account']
		
		//contains
//		//htmltag[contains(@attr, 'value')]
//		//htmltag[contains(@attr, 'value') and contains(@attr2, 'value')]
//		//htmltag[contains(@attr, 'value') and @attrb2='value']
//		//htmltag[@attr='value' and contains(@attrb, 'value')]
//		//htmltag[@attr='value' and contains(@attrb, 'value') and @attr3='value']
//		
//		contains() with text()
//		//htmltag[contains(text(), 'value')]
//		//h1[contains(text(), 'Register')]
		
//		contains with attr and no contains with text()
//		//htmltag[contains(@attr, 'value') and text()='value']
//		//a[contains(@href,'wishlist') and text()='Wish List']
//		//a[contains(@href,'wishlist') and text()='Wish List' and @class='list-group-item']
		
		
//		starts-with()
//		//htmltag[starts-with(@attr, 'value')]
//		//htmltag[starts-with(text(), 'value')]
		
//		ends0with() - deprecated
		
//		By.classname - multiple classnames(class names with spaces in DOM) not supported - InvalidSelectorException- compound class names not permitted
//		custom xpath works with multiple classnames
		
		
//	index with capture group - put the xpath identifying multple elements in bracket -() to sort of create list of similar elements and then use index to identify a specific one
//		(//a[text()='Forgotten Password'])[2] - gives one unique element
//		(//a[text()='Forgotten Password'])[last()] - goes to last element in the list - use last()
//		(//input[@class='form-control'])[last()] same as below
//		(//input[@class='form-control'])[position()=last()]
//		we can also get second last - (//input[@class='form-control'])[last()-1]
//		both below are valid and same:
//		(//input[@class='form-control'])[1]
//		(//input[@class='form-control'])[position()=1]
		
//		https://www.amazon.com/ - capture help link from footer links:
		
//		((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]/ul/li)[last()]/a Or below also works
//		((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
//		naveen site assignment
//		 (//div[@class='list-group']/a)[position()=1] - will give login - first element on right side link panel
//		(//div[@class='list-group']/a)[position()=last()] - will give Newsletter - last element on right side link panel
		
		
//		normalize-space() - to be used for text based xpath that has space - eg naveen website - yes
		
//		//label[normalize-space()='Yes']
		
				
		
		
		
		
		
		
		
		
	}

}
