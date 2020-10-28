package lesson18;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderChallange {

	@DataProvider
	public Object[][] getClientInfo() {
		Object[][] clients = new Object[3][3];

		clients[0][0] = "Eshmat Toshmatov";
		clients[0][1] = 660962;
		clients[0][2] = "1234 Parkside Ave";

		clients[1][0] = "Ali Baqoev";
		clients[1][1] = 3455426;
		clients[1][2] = "434 Six Ave";

		clients[2][0] = "Anvar Bobojonov";
		clients[2][1] = 3543466;
		clients[2][2] = "2352 Lee Ave";

		return clients;
	}

	@Test(dataProvider = "getClientInfo")
	public void clientsInfo(String name, int phone, String address) {
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + phone);
		System.out.println("Address: " + address);
	}

}
