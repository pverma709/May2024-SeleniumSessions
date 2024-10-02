package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void pageTitleTest() {
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void pageUrlTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("route=account/login"));
	}

	@Test
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
	}
	
}
