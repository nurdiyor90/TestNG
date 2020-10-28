package lesson18;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@DataProvider
	public Object[][] getUserCredentials(){
		Object[][] users = new Object [4][2];
		
		users[0][0] = "users1";
		users[0][1] = "password1";
		
		users[1][0] = "users2";
		users[1][1] = "password2";
		
		users[2][0] = "users3";
		users[2][1] = "password3";
		
		users[3][0] = "users4";
		users[3][1] = "password4";
		return users;
		
	}
	
	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][3];

		// 1
		data[0][0] = "66676";
		data[0][1] = 5000;
		data[0][2] = 2000;

		// 2
		data[1][0] = "46526";
		data[1][1] = 458;
		data[1][2] = 0;

		// 3
		data[2][0] = "189696";
		data[2][1] = 0;
		data[2][2] = 234;

		return data;
	}

	@Test(dataProvider = "getData")
	public void testAccountActions(String accNum, int deposit, int withdrawl) {
		System.out.println("Account Number: " + accNum);
		System.out.println("Depositing: " + deposit);
		System.out.println("Withdrawing: " + withdrawl);

	}
	
	@Test(dataProvider = "getUserCredentials")
	public void testLogins(String username, String password) {
	System.out.println("Username: " + username);
	System.out.println("Password: " + password);
	}
}
