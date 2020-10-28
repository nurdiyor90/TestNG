package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class FrameElement {

	@Test
	public void iFrame() throws InterruptedException {

		String url = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); //Switching using element
	
		driver.findElement(By.id("draggable")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		
		
		Thread.sleep(10000);
		driver.close();
	}
}