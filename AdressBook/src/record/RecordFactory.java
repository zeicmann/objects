package record;

import java.util.Scanner;

import address.AddressData;
import address.AddressFactory;
import phone.PhoneFactory;
import phone.PhoneNumber;
import userData.UserInput;

public class RecordFactory {
	public static Record createNewRecord(Scanner s){
		String name = UserInput.stringInput(s, "Please specify new contact name.");
		AddressData address = AddressFactory.createNewAddress(s);
		PhoneNumber phone = PhoneFactory.createNewNumber(s);
		return new Record(name, address, phone);
	}
}
