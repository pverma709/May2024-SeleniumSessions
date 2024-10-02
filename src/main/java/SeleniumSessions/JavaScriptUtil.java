package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	private WebDriver driver; // we need to supply driver to this class to call in our methods
	private JavascriptExecutor js;
	
	public JavaScriptUtil(WebDriver driver) { // creating constructor to initialize the driver
	
		this.driver = driver;
		js =  (JavascriptExecutor)driver; // this line will be needed in all methods so creating object in constructor itself to avoid duplicate code
	}
	
	public String getPageTitleUsingJavascript() {
		
		return js.executeScript("return document.title;").toString(); //since the string returned is javascript, we use toString() to convert to java string
			
	}
	
	
	public String getPageUrlUsingJavascript() {
		
		return js.executeScript("return document.URL;").toString(); //since the string returned is javascript, we use toString() to convert to java string
		
		
	}
		
//	javascript code to genearte javascript alert on webpage - alert('hello java'); - go to inspect page, click on console and run this js method to generate alert
//	one use case is to used for debugging or undertsnding the flow on application as we navigate from one page to other
	
	
	public void generateJsAlert(String alertMsg) {
		
		js.executeScript("alert('"+alertMsg+"')"); // this method not return anything so no need of return in js code
		
	}	

// js method to extract text of all html weblements on the page - link/paragraphs/header footer etc - document.documentElement.innerText
// used for content testing - for eg to validate if some text present on webpage
	
	public String getPageInnerText() {
		
		
		return js.executeScript("return document.documentElement.innerText;").toString();
		
	}
	
	
	// history oject to stimulate back, forward and refersh actions on webpage - history.go(-1) - back, history.go(1) - forward, history.go(0) - refresh 
	
	
		public void goForwardWithJs() {
			js.executeScript("history.go(1)");
		}
	
	
		public void goBackWithJs() {
			js.executeScript("history.go(-1)");
		}
	
		public void pageRefreshWithJs() {
			js.executeScript("history.go()");
		}
	
		
// Responsive Testing zoom in and out by passing diff % - document.body.style.zoom = '400.0%' - this works for chrome/edge/safari/firefox browser
		
		public void chromeEdgeSafariFirefoxZoom(String zoomPercentage) {
			
			String zoom = " document.body.style.zoom = '"+zoomPercentage+"%' ";
			js.executeScript(zoom);
		}

//	Scrolling using Js
		
//		scroll from top to specific pixel height. top of page index is 0
		
		public void scrollPageDownBySpecificPixelFromTop(String heightInPixel) {
			js.executeScript("window.scrollTo(0, '"+heightInPixel+"')");
			
		}
		
//		scroll to top from specific pixel height. top of page index is 0
		
		public void scrollPageUpFromSpecificPixelHeight(String heightInPixel) {
			js.executeScript("window.scrollTo('"+heightInPixel+"', 0)");
			
		}
	
	
//		scroll from top to bottom of page. top of page index is 0
	
	
		public void scrollPageFromTopToBottom() {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}
	
//		scroll from  bottom of page to top. top of page index is 0
	
		public void scrollPageFromBottomToTop() {
			js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			
		}
	
	
	
//		scroll from  top of page to middle. we can also one third, one fourth like this top of page index is 0
		
		public void scrollPageFromTopToMiddle() {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
			
		}
	
	
//	scroll to a particular elemnt is visible on page (static page not infinite scrolling)
		
		public void scrollToViewElement(WebElement ele){
			
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			
		}
		
		
		
//		draw border around an element - can be used with take screenshot in case of failed tc - draw border around bug area in SS
		
		public void drawBorder(WebElement ele) {
			
			js.executeScript("arguments[0].style.border='3px solid red'", ele);
			
		}
		
		
		public void flash(WebElement elem) {
			String bgColor = elem.getCssValue("backgroundColor"); // original value white
			for(int i = 0; i<100; i++) {
				changeColor("rgb(0,200,0)", elem);// rgb value for green color
				changeColor(bgColor, elem);//white
			}
			
		}
		
		
		private void changeColor(String color, WebElement ele) {
			
			js.executeScript("arguments[0].style.backgroundColor = ' " + color + " ' " , ele);// g-w-g-w-g will keep changing no of times loop runs for the duration below and gives a effecr of flashing
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
