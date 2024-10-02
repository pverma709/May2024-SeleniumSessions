package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.manage().window().minimize();
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
