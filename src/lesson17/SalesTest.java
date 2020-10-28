package lesson17;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SalesTest {

	@Test(groups = { "Regression" })
	public void testSales1() {
		System.out.println("testSales1");
	}

	@Test(groups = { "Functional", "Smoke" })
	public void testSales2() {
		System.out.println("testSales2");
	}

	@Test(dependsOnMethods ="testSales4" )
	public void testSales3() {
		System.out.println("testSales3");
	}

	@Test
	public void testSales4() {
		System.out.println(" testSales4");
		Assert.assertTrue(false);
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeGroups(groups = { "Regression" })
	public void beforeGroups() {
		System.out.println("Before Regression");
	}

	@AfterGroups(groups = { "Regression" })
	public void afterGroups() {
		System.out.println("After Regression");
	}
}
