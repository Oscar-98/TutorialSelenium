package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class various {

	
	@BeforeTest
	private static void start() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
		
		
		}
	
	
	private static void uiElementsdisabledOrNo() {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
	}
	
	
	@Test
	
	private static void uiElementsEnabledornot() throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
    Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5");
	Thread.sleep(3000);
	driver.quit();
	driver.switchTo().alert().accept();
	
	}
	
	
	@Test
	
	public void Suma() {
		int as = 1100;
		int bs = 175;
		int x = as+bs;
	System.out.println(x);
	}
	
	
}
