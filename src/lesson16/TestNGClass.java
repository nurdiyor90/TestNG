package lesson16;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestNGClass {

	@Test (groups = {"Smoke"})
	public void testA() {
		System.out.println("Test A");
	}

	@Test (groups = {"Smoke", "Regression", "Functioanl"})
	public void testB() {
		System.out.println("Test B");
		Assert.assertTrue(false);
	}

	@Test
	public void testC() {
		System.out.println("Test C");
	}

	@Test (groups = {"Regression"})
	public void testD() {
		System.out.println("Test D");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
