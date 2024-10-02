package javaStreamsFromNaveenYouTube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaStreamPractice {


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		linkList.stream().map(e -> e.getText()).forEach(System.out::println);
		
		System.out.println("**********************below list without space!!****************");
		
		linkList.stream().filter(e -> !e.getText().equals("")).map(e -> e.getText()).forEach(System.out::println);
		
		System.out.println("**********************find first ****************");
		
		String firstLink = linkList.stream().filter(e -> !e.getText().equals("")).map(e -> e.getText()).findFirst().get();
		
		System.out.println(firstLink);
		
		System.out.println("**********************starts with A ****************");
		
		linkList.stream().filter(e -> !e.getText().equals("") && e.getText().startsWith("A")).map(e -> e.getText()).forEach(e -> System.out.println(e));
		
		System.out.println("**********************contains ****************");
		
		linkList.stream().filter(e -> !e.getText().equals("") && e.getText().contains("Password")).map(e -> e.getText()).forEach(e -> System.out.println(e));

	}

}
