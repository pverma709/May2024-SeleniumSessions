package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
//		whenever fileupload button there, dont click ont it. clicking opens windows pop up and selenium cant interact with desktop apps only with webpage
//		very imp - button shud have a type sttributewith value file. type='file'. mandatory. if not there ask deveoper to add as selenium looks for this attribute to handle using sendkeys
//		use sendkeys on file upload button and supply complete path of the file and it gets attached
//		C:\\Users\\verma\\Desktop\\fileUploadTest.txt - IMP - excape '\' by doubling these and make sure file extension there in filename otherwise invalidArgumentException
		
		WebElement chooseFileButton = driver.findElement(By.name("upfile"));
		chooseFileButton.sendKeys("C:\\Users\\verma\\Desktop\\fileUploadTest.txt");
		
		
		

	}

}
