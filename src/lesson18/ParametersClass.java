package lesson18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass {
//Using 
	String userName = "kjhghae7";
	String passWord = "hlc89";
	@Test
	public void test() {
		System.out.println("Username " + userName);
		System.out.println("Password " + passWord );
	}

	@Parameters({ "username", "password" })
	@Test
	public void testLogin(String username, String password) {

		System.out.println("Username is " + username);
		System.out.println("Password is " + password);
	}

	@Parameters({ "username", "password" })
	@Test
	public void testLogin2(String username, String password) {

		System.out.println("Username is " + username);
		System.out.println("Password is " + password);
	}

	@Parameters({ "username", "password" })
	@Test
	public void testLogin3(String username, String password) {

		System.out.println("Username is " + username);
		System.out.println("Password is " + password);
	}

}
