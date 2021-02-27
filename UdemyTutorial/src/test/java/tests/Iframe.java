package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframe {
	
	
	
	@BeforeTest

	public void start() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");

}

@Test
	public void iframes() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement testIframes = driver.findElement(By.id("sampleHeading"));
		Actions actions = new Actions(driver);
		actions.doubleClick(testIframes).build().perform();
		
		Thread.sleep(5000);
		
		
		
		
	}









}