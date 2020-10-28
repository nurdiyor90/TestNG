package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import jdk.jfr.Percentage;

public class ActionClass {
	// @Test
	public void actionsClass() throws InterruptedException {

		String url = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); // Switching using
																								// element
		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		// act.dragAndDrop(source, target).build().perform();
		// act.dragAndDropBy(source, -100, -200).build().perform();

		Action moving = act.clickAndHold(source).moveByOffset(100, 150).release().build();

		moving.perform();
		Thread.sleep(2000);
		moving.perform();

		//act.click(source);
	//	act.doubleClick();
		//act.moveByOffset(50, 100);
		//act.moveToElement(target); // hover over
	//	act.sendKeys(keys);
		//act.keyDown(key); // holds some key of the keyboard
		//act.keyUp(key); //

		Thread.sleep(10000);
		driver.close();
	}

	@Test
	public void actionsClass2() throws InterruptedException {

		String url = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//input[@name='s']"))).click().keyDown(Keys.SHIFT).sendKeys
		("with shift").keyUp(Keys.SHIFT).sendKeys("without shift").build().perform();
		//KeyDown (Keys.SHIFT) means holding the shift on keyboard
		//KeyUp (Keys.SHIFT) means letting shift go from  keyboard
		
		
		
		
		
		
}
	
}
