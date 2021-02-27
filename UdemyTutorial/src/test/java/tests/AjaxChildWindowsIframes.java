package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxChildWindowsIframes {
	
	@BeforeTest

	public void start() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");

	}

	@Test
	public void ajaxmouseinteractions() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/-/es/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("HelloWorld").doubleClick().build().perform();

		WebElement move = driver.findElement(By.cssSelector("span[class='nav-line-2 nav-long-width']"));

		actions.moveToElement(move).contextClick().build().perform();
		
		
		Thread.sleep(5000);;
		
		driver.quit();
		
		
		
	}
	
	@Test
	public void managewindows() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("tabButton")).click();
		

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		Thread.sleep(3000);

		driver.switchTo().window(parentId);

	}
	

}
