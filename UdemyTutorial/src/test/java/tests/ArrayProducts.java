package tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayProducts {

	@BeforeTest

	public void Start() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");

	}

	@Test

	public void arraylist() {

		
		WebDriver driver = new ChromeDriver();
		int j = 0;


String[] itemsNeeded = { "Brocolli", "Cucumber" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	     try {
	 		Thread.sleep(10000);
	 	} catch (InterruptedException e) {
	 	
	 		e.printStackTrace();
	 	}
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List itemsNeedsList = Arrays.asList(itemsNeeded);

			if (itemsNeedsList.contains(formattedName)) {

				j++;

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

				if (j == 2) {
					break;
				}

			}

		}

	}
	
	
	
	
}
