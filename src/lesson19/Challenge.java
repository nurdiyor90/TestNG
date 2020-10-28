package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Challenge {

	// from airocheap.com choose 1 adult\, 1 senior, 2 youths and click on Multi City
	@Test
	public void dropdown() throws InterruptedException {

		String url = "https://www.cheapoair.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='multiTrip']//following-sibling::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("travellerButton")).click();
		driver.findElement(By.id("addseniors")).click();

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("addyouth")).click();

		}

		Thread.sleep(2000);
		Select ByDropdown = new Select(driver.findElement(By.id("Class")));

		ByDropdown.selectByVisibleText("Business");
	}
}
