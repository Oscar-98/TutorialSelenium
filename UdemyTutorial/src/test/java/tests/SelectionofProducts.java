package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectionofProducts {
	
	
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\oscar\\Desktop\\UdemyTutorial\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i ++) {

			String name = products.get(i).getText();

			if (name.contains("Cucumber"))
				driver.findElements(By.xpath("//button[contains(text(),\"ADD TO CART\")]")).get(i).click();
			break;
		}

	}

}
