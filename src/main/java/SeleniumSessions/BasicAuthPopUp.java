package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		
		
//		BasicAuthPopUp - to enter user credentials. sometimes the page/info doesnt load untill credentials are passed for basic auth
//		auth pop ups are not js alerts
//		cant switch to auth pop ups
//		to handle we need to pass cresntials in the url itslef. If these are correct, we will not see the pop up and will succesfully launch the app. 
//		username/password passed after https:// and are separated by semiclon. eg. - https://admin:admin@the-internet.herokuapp.com/basic_auth or we can store in variable and pass so no hard coding
//		the limitation is that if password has @, it wont work so passowrd shudn't have @
//		Seleneium 4 - HasAuthenticated interface added and @ issue in pwd handled - will be covered later
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String pwd = "admin";
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://" + username + ":" + pwd + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
