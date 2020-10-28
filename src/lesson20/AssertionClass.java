package lesson20;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClass {
	String a="value1";
	String b="value2";
	String c="value1";
	
	@Test
	public void asserts () {
		Assert.assertEquals(a, c,  "Are They Equal");
		Assert.assertNotEquals(a, b,  "Are They Not Equal?");
		
	}
	
	
	
	

}
