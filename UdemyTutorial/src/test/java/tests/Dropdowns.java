package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdowns {
	
	@BeforeTest
	
	private static void start() {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
			
	}
	
	
	
	@Test
	
	public void staticdropdown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
		Select currencyDrop = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));

		currencyDrop.selectByValue("USD");
		Thread.sleep(3000);
		currencyDrop.selectByVisibleText("AED");
		Thread.sleep(3000);
		currencyDrop.selectByIndex(1);
		Thread.sleep(3000);
		driver.quit();
	}

		
	  
	  
	 

	
	@Test
	
	public static void basicDinamicDropdown() throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Select departureCityDrop = new Select(driver.findElement(By.cssSelector("input[name=’ctl00_mainContent_ddl_originStation1_CTXT’]")));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
	    
	
	
	
	}
	
	@Test
	
	public static void parentChildDropdown() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CJB']"));
	}
	
		
	@Test
	public static void autoSuggestiveDropdown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> optionsCountrieslist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement optionsCountries : optionsCountrieslist) {

			if (optionsCountries.getText().equalsIgnoreCase("India"))

			{
				optionsCountries.click();

				break;

			}

		}

	}
	
	
	
	
	}


