package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleElements {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int count = linkList.size();
		
		System.out.println("count is " + count);
		
		int countOfProperLinks = 0;
		int countOfBlankLinks = 0;
		
		// for loop
		
		for(int i = 0; i<count; i++) {
			String text = linkList.get(i).getText();
			if( text.length()!=0) {
			System.out.println(i + " "+ text );
			countOfProperLinks++;
			}else {
				countOfBlankLinks++;
			}
			
			
		}
		
		System.out.println("Blank links " + countOfBlankLinks);
		System.out.println("Proper links " + countOfProperLinks);
		
		
		System.out.println(".......................");		

		// for each
		
		int countOfProperLinksForEach = 0;
		int countOfBlankLinksForEach = 0;
		
		int counter = 0;
		for(WebElement ele : linkList ) {
			String text = ele.getText();
			if(text.length()!=0){
				System.out.println(counter + " link is "+ text);
				countOfProperLinksForEach++ ;
			}else {
				countOfBlankLinksForEach++ ;
			}
			counter++;
			
			
			
		}
		
		System.out.println("countOfBlankLinksForEach " + countOfBlankLinksForEach);
		System.out.println("countOfProperLinksForEach "+ countOfProperLinksForEach);
				
		System.out.println(".......................");	
		
		//diff approach
		
		
		
		int countOfworkingLinks = 0;
		
		int counterx = 0;
		for(WebElement ele : linkList ) {
			String text = ele.getText();
			if(text.length()!=0){
				System.out.println(counterx + " link is "+ text);
				countOfworkingLinks++ ;
			}
			
			counterx++;
			
			
			
		}
		
		int countOfBrokenLinks = counterx - countOfworkingLinks;
		
		
		System.out.println("count Of BrokenLinks " + countOfBrokenLinks);
		System.out.println("count Of working Links "+ countOfworkingLinks);
		
	}
	
	
	
	

}
