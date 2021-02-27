package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators {
@BeforeTest

public void start() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
	
}


	
	

	@Test
	public void staticdropdown() {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	Select passengersDrop = new Select(driver.findElement(By.className("valid")));
	
	passengersDrop.selectByValue("USD");
	
	
	
	}
	
	@Test
	
	public void dinamicDropdown() {
		
		
		
		
		
		
	}
	
	
	
	
}
