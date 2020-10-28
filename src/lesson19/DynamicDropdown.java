package lesson19;

import java.sql.DatabaseMetaData;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicDropdown {

	// from airocheap.com choose 1 adult\, 1 senior, 2 youths in businness class
	// @Test
	public void dropdown() throws InterruptedException {

		String url = "https://www.cheapoair.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);
///////////////////////////////////////////////////////////////////

		WebElement fromBox = driver.findElement(By.id("from0"));

		Thread.sleep(1000);

		fromBox.click();
		fromBox.sendKeys(Keys.DELETE);
		fromBox.sendKeys("new");

		Thread.sleep(1000);
		for (int i = 0; i < 2; i++) {
			fromBox.sendKeys(Keys.ARROW_DOWN);
		}

		fromBox.sendKeys(Keys.ENTER);

		WebElement toBox = driver.findElement(By.id("to0"));
		toBox.sendKeys("Tas");
		Thread.sleep(1000);
		toBox.sendKeys(Keys.ENTER);

	}

	// @Test
	public void radioBtn() throws InterruptedException {

		String url = "https://www.cheapoair.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='multiTrip']//following-sibling::label")).click();

		
		
	}


	
	
	
	
	
}
