package lesson17;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreditTest {

	@Test
	public void creditTest1() {
		System.out.println("creditTest1");
	}

	@Test
	public void creditTest2() {
		System.out.println("creditTest2");
	}

	@Test
	public void loanTest1() {
		System.out.println("loanTest1");
	}

	@Test
	public void loanTest2() {
		System.out.println("loanTest2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass (groups = {"Functional"})
	public void afterClass() {
		System.out.println("After Class");

	}
@BeforeTest (groups = {"Smoke"})
public void beforeTest() {
	System.out.println("Before Test");
}


}
