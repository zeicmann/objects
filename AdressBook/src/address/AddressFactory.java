package address;

import java.util.Scanner;

import format.AddressFormat;
import userData.UserInput;

public class AddressFactory {
	public static AddressData createNewAddress(Scanner s){
		AddressFormat c = UserInput.countryInput(s);
		String postalCode = UserInput.stringInput(s, "Please specify postal code for a new contact.");
		String city = UserInput.stringInput(s, "Please specify new City");
		String street = UserInput.stringInput(s, "Please specify street name.");
		String house = UserInput.stringInput(s, "Please specify house number.");
		return new AddressData(c, postalCode, city, street, house);
	}
}
