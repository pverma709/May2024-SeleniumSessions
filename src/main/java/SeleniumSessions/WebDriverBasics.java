package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverBasics {

	public static void main(String[] args) {
		
		ChromeDriver driverx = new ChromeDriver();
		
//		FirefoxDriver drivexr = new FirefoxDriver();
		driverx.get("https://google.com");
		String title = driverx.getTitle();
		System.out.println(title);
//		driverx.quit();
//		System.out.println(driverx.getTitle()); //  org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		driverx.close();
		System.out.println(driverx.getTitle()); // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		

	}

}
