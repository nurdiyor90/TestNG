package lesson20;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

public class childWindow {

	@Test
	public void childWindows() throws InterruptedException {
		String url = "https://letskodeit.teachable.com/p/practice";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(url);
		String mainWindow = driver.getWindowHandle();

		driver.findElement(By.id("openwindow")).click();
		Set<String> handles = driver.getWindowHandles();
		String childWindow = "";
		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				childWindow = handle;
			}

		}

		// Now child window opens
		// Now driver needs to switch to child window

		driver.switchTo().window(childWindow);

		driver.findElement(By.id("search-courses")).sendKeys("Typing Test");

		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(mainWindow);

		driver.findElement(By.id("opentab"));

	}

}