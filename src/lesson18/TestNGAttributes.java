package lesson18;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNGAttributes {
	
	//TestNG Helper Attributes
	
	@Test(dependsOnMethods = {"testSales2"})
	public void testSales1() {
		System.out.println("testSales1");
	}

	@Test
	public void testSales2() {
		System.out.println("testSales2");
		org.testng.Assert.assertTrue(false);
	}

	@Test(timeOut = 10000)
	public void testSales3() {
		System.out.println("testSales3");
	}

	@Test (enabled = false)
	public void testSales4() {
		System.out.println("testSales4");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Regression");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("After Regression");
	}
	
	
	
	
	
	
	
}
