package tests2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingBrowser {
	
	
	
	
	@BeforeTest
	public void Start() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
	
	}
	
	
	
	
	@Test
	
	void maximizewindowAndDeleteCookies() {
		
		WebDriver driver = ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("nameoftheCookie");
		//driver.manage().addCookie("nameofthecookie");
		
		driver.get("asdasd");
		
		
		
	}




	private WebDriver ChromeDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
