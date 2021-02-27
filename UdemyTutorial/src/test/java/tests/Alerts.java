package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {

	@BeforeTest
	private static void start() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");

	}
	
	
	
@Test
	private static void javAlerts() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Oscar");
		Thread.sleep(5000);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.wait(5000);
		driver.quit();
		
		
	}
	
	@Test
	private static void javAlertsAcceptCancel() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Oscar");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.quit();

	}
	
	
	
	
}
