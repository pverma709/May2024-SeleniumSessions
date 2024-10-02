package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1500);
		
		driver.navigate().to("https://www.amazon.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		Thread.sleep(1500);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1500);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		

	}

}
