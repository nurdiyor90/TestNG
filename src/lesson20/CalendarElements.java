package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class CalendarElements {

	public void selcetingDates() throws InterruptedException {

		String url = "https://www.cheapoair.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.id("cal0")).click();

		// It will always choose the current date
		driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();
		Thread.sleep(1000);

		// It will always choose the next day
		 driver.findElement(By.xpath("//a[@class=' month-date']")).click();
		 Thread.sleep(000);

		// It will always select arrival date 7 days after
		driver.findElement(By.xpath(" //a[contains (@class, ' month-date is--today')]//following::a[10]")).click();

	}
}