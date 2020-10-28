package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleClick {

	@Test
	public void dropdown() throws InterruptedException {

		String url = "https://www.cheapoair.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.id("travellerButton")).click();
		for(int i=0; i<4; i++) {
		driver.findElement(By.id("addadults")).click();
		}
		for(int i=0; i<2; i++) {
			driver.findElement(By.id("addchild")).click();
			}

	}
}
