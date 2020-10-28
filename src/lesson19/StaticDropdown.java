package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdown {

	@Test
	public void dropdown() throws InterruptedException {

		String url = "http://automationpractice.com/index.php";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(3000); // waits 3 sec
		Select sortByDropdown = new Select(driver.findElement(By.cssSelector("select[id='selectProductSort']")));

		sortByDropdown.selectByIndex(1);
		Thread.sleep(3000); // waits 3 sec
		sortByDropdown.selectByValue("name:asc");
		Thread.sleep(3000); // waits 3 sec
		sortByDropdown.selectByVisibleText("Price: Highest first");
        
		sortByDropdown.deselectAll(); //it will diselect all the dropdown

		sortByDropdown.getOptions(); // it will give you all the options

		sortByDropdown.isMultiple(); //checks if the select has multiple attributes. It returns true or false

		driver.close();
	}
	
}
