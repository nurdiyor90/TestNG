package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class JavaScriptAlerts {

	@Test
	public void alert() throws InterruptedException {

		String url = "https://letskodeit.teachable.com/p/practice";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();
		
		
		
		
		
		driver.close();
	}
}