package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExceutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver(); // top casting. reference of webdriver interface and object of chromedriver
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
		
		By email = By.id("input-email");// this element on login page and not home
		
		JavascriptExecutor js =  (JavascriptExecutor)driver; // interface casting. casting driver to interface javascriptExecutor so we can access its executeScript method. RemoteDriver extends javascriptExcecutor interface(along with webdriver and other interfaces) and 
//																implements its executScript method
//		String title = js.executeScript("return document.title;").toString(); //since the string returned is javascript, we use toString() to convert to java string
//		System.out.println(title); 
		
//		Note : internally it is using javascript code and not selenium getTitle()/getUrl(). this way we can pass any javascript code to executeScript() and run the javascript code
		
//		System.out.println("############calling utility methods##################");
//		
//		getTitleUsingJavascript();
//		getUrlUsingJavascript();
		
//		calling JavaScriptUtil methods now
		
//		System.out.println("############calling JavaScriptUtil utility methods##################");
//		
		JavaScriptUtil jUtil = new JavaScriptUtil(driver);
		
//		System.out.println(jUtil.getPageTitleUsingJavascript());
//		System.out.println(jUtil.getPageUrlUsingJavascript());
		
//		jUtil.generateJsAlert("I am on home page");
		
//		String pageText = jUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		if(pageText.contains("allows you to make a call by simply")) {
//			System.out.println("test pass");
//		}
		
//		jUtil.goBackWithJs();
//		
//		jUtil.goForwardWithJs();
//		
//		jUtil.pageRefreshWithJs();
	
		
//		jUtil.chromeEdgeSafariFirefoxZoom("200");
		
		
//		jUtil.scrollPageDownBySpecificPixelFromTop("350");
//		Thread.sleep(3000);
//		
//		jUtil.scrollPageUpFromSpecificPixelHeight("0");
//		Thread.sleep(3000);
//		
//		jUtil.scrollPageFromTopToBottom();
//		
//		
//		Thread.sleep(3000);
//		
//		jUtil.scrollPageFromBottomToTop();
//		Thread.sleep(3000);
//		
//		jUtil.scrollPageFromTopToMiddle();
//		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.id("input-email"));
		WebElement ele2 = driver.findElement(By.xpath("(//div[@class='well'])[2]"));
		jUtil.drawBorder(ele1);
		jUtil.drawBorder(ele2);
		jUtil.flash(ele1);
		
//		driver.quit();

	}

	// creating utility for above code and will move to JavaScriptUtil
	
	public static String getTitleUsingJavascript() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString(); //since the string returned is javascript, we use toString() to convert to java string
		System.out.println(title);
		return title;
		
		
	}
	
	public static String getUrlUsingJavascript() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		String url = js.executeScript("return document.URL;").toString(); //since the string returned is javascript, we use toString() to convert to java string
		System.out.println(url);
		return url;
		
		
	}
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
