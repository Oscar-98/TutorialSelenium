package tests2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Certifications {


	
	
	@BeforeTest
	public void Start() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
	
	
	}
	
	@Test
	
	public void Httpscertification() {
		
		
		
		DesiredCapabilities desiredCh = DesiredCapabilities.chrome();
		
		desiredCh.acceptInsecureCerts();
		desiredCh.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		
		
		ChromeOptions chrome = new ChromeOptions();
		
		chrome.merge(desiredCh);
		
		WebDriver driver = new ChromeDriver(chrome);
		
		
		
	}
	
	
	
}
