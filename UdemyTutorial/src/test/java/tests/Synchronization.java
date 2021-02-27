package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Synchronization {

	@BeforeTest

	public void Start() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
			}
	
	
	@Test
	public void implicitWait() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		// this is the MAXIMUM TIME TO THE TEST WILL WAIT, NOW THIS WILL WORK IN ALL THE THREAD
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.findElement(By.id("visibleAfter")).click();
		// The square is framed with blue, what indicates was clicked.
		
		//The bad thing of this, is if one thing doesn't have to delay, and for that reason it's a bug, the system will not detect it.
		// Too can hide perfomance issues.
		
		
	}
	
	
	@Test
	
	public void explicitWait() {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait explwait = new WebDriverWait(driver, 5);
		
		
		
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		explwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("visibleAfter")));
		
		driver.findElement(By.id("visibleAfter")).click();
		
	}
	
	
	public void fluentWait() {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		
	}
	
	
	
}
