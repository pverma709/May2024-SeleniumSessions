package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopUpHandling {
	
	

	public static void main(String[] args) throws InterruptedException {

		//js alerts - 3 types - only 1 pop up at a time can appear
		//alert - js alert method -  - alert "I am js alert"
		//confirm - method - confirm('do you agree');
		//prompt - method - prompt('pls enter your email');
//		Note: NoAlertPresentException - in case no alert pop up on the page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();// gives an alert object and driver points to alerts. Note - We cant capture any elements on js alerts 
//		String text = alert.getText();
//		System.out.println(text);
		
//		alert.accept(); // same as ok button - driver points back to webpage
//		alert.dismiss(); //same as escape key - driver points back to webpage
		
//		driver.quit();
		
		//2 confirm alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();// gives an alert object and driver points to alerts. Note - We cant capture any elements on js alerts 
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept(); // same as ok button - driver points back to webpage
//		alert.dismiss(); //same as cancel button - driver points back to webpage
		
		
		//2 prompt alert - only one text field
		
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();// gives an alert object and driver points to alerts. Note - We cant capture any elements on js alerts 
				String text = alert.getText();
				System.out.println(text);
				
				alert.sendKeys("I am not interested");
				
				Thread.sleep(3000);
				
				alert.accept(); // same as ok button - driver points back to webpage
//				alert.dismiss(); //same as cancel button - driver points back to webpage
	
	}
	

}
 