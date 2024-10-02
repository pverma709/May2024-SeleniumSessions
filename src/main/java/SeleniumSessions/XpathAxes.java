package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		
		
//		webtable
		
//		immediate child - parent and single slash
//		indirect child - parent and double forward slash
		
//		immeditae parent - child element/..
//		immeditae parent of immediate parent - child element/../.. - eg. - //input[@id='input-firstname']/../.. in naveen site - we can continue going up and up - backward traversing the DOM
//		we will go all the way to body and html tag
//		another way to write parent element:
//		child element/parent::parent element tag
//		//input[@id='input-firstname']/parent::div , //input[@id='input-firstname']/parent::div/parent::div - parent used only for immeditae parent of any element
		
//		for indirect parents or ancestors - use uag name ancestor
		
//		//input[@id='input-firstname']/parent::div/ancestor::form
		
//		if multiple ancestors with same tag - give attrb to narrow serach
//		//input[@id='input-firstname']/parent::div/ancestor::div[@id='content']
		
//		select checkbox on webtable
		
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
//		alternate paths for xpath for above checkbox
		
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		
//		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
//		create utility for above step since in above xpath only name is changing so we can pass it thru a method and use for any checkbox click
		
	
//		xpath to find remaining detsila of user in the row on the RHS of table
		
//		//a[text()='John.Smith']/parent::td/following-sibling::td - gives list of all the tds with all user details
		
//		we can capture all tags following a specific element using following::tag name. similarly we can use preceding to identify preceding elements
//		//input[@id='input-email']/following::input - we can filter basis of some condition after that
//		//input[@id='input-email']/preceding::input
		
		
		selectUser("John.Smith");
		selectUser("Joe.Root");
				
		System.out.println(getUserDetail("John.Smith"));
		
		System.out.println(getUserDetail("Joe.Root"));
	}
	
	public static List<String> getUserDetail(String user) {
		
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+user+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList = new ArrayList<String>();
		
		for(WebElement e : userDetails) {
			String text = e.getText();
			userDetailsList.add(text);
		}
		
		return userDetailsList;
		
		
	}
	
	
	public static void selectUser(String user) {
		
//		driver.findElement(By.xpath("//a[text()='"+user+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//		using second xpath
		
		driver.findElement(By.xpath("//a[text()='"+user+"']/ancestor::tr//input[@type='checkbox']")).click();
		
	}
	
	
	
	

}
