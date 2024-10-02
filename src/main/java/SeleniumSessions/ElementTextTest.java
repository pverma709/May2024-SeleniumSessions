package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPwdLink = By.linkText("Forgotten Password");
		By footerHeader = By.tagName("h5");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		System.out.println(eleUtil.getText(header));
		System.out.println(eleUtil.getText(para));
		System.out.println(eleUtil.getText(forgotPwdLink));
		System.out.println(eleUtil.getText(footerHeader));
		
		
		

	}

}
