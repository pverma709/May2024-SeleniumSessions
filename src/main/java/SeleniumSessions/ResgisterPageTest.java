package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResgisterPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtility brUtil = new BrowserUtility();
		
		WebDriver driver = brUtil.launchDriver(" FireFoX ");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		
//		By firstName = By.id("input-firstname");
//		By firstName = By.xpath("//label[text()='First Name']");
		By firstName = By.xpath("//label[text()='First Name' and @class ='col-sm-2 control-label']");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdConfirm = By.id("input-confirm");
		By checkBox = By.name("agree");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By header = By.tagName("h1");
		By successHeader = By.tagName("h1");
		By warning = By.className("alert-dismissible");
		By placeHolderText = By.className("form-control");
		By textFieldLabel = By.className("control-label");
		
		
		ElementUtil eUtil = new ElementUtil(driver);
		
//		eUtil.doSendKeys(firstName, "John");
//		eUtil.doSendKeys(lastName, "dary");
//		eUtil.doSendKeys(email, "Johna12scf@gmail.com");
//		eUtil.doSendKeys(telephone, "444-896-1254");
//		eUtil.doSendKeys(pwd, "xcvn");
//		eUtil.doSendKeys(pwdConfirm, "xcvn");
//		eUtil.doClick(checkBox);
//		eUtil.doClick(continueButton);
//		eUtil.getText(header);
//		String successMsg = eUtil.getText(successHeader);
//		if(successMsg.equals("Your Account Has Been Created!")) {
//			System.out.println("registeration complete - Test Pass");
//			
//		}else {
//			System.out.println("test fail");
//		}
//		
//		System.out.println(eUtil.getText(warning));
//		Thread.sleep(3000);
		
//		eUtil.getElementsCount(placeHolderText);
//		eUtil.printElementsTextList(placeHolderText);
//		eUtil.printElementsTextList(textFieldLabel);
		System.out.println("*******************");
		System.out.println(eUtil.isElementDisplayed(firstName));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		brUtil.closeBrowser();
	
	}

}
