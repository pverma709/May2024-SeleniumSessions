package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	
	
	WebDriver driver;
	
	
	/**
	 * This method returns the driver based on the browser passed
	 * @param browserName
	 * @return driver
	 */
	public WebDriver launchDriver(String browserName ){
		
	System.out.println("broswer is " + browserName );
	
	switch(browserName.trim().toLowerCase()) {
	
	case "chrome":
	driver = new ChromeDriver();
	System.out.println(driver);
	break;
	case "firefox":
		driver = new FirefoxDriver();
		System.out.println(driver);
		break;
	case "edge":
		driver = new EdgeDriver();
		System.out.println(driver);
		break;
	default:
		System.out.println("Pls pass rightBrowser");
		throw new BrowserException("INVALID BROSWER");
	
	}
	
	return driver;
	
	}
	
	
	public void launchUrl(String url) {
		
		if(url.indexOf("http")!=0) {
			throw new BrowserException("http missing in url");
			
		}
		driver.get(url);
	}
	
	public void launchUrl(URL url) {
		driver.navigate().to(url );
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
	
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
