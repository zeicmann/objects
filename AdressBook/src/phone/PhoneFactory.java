package phone;

import java.util.Scanner;

import format.PhoneFormat;
import userData.UserInput;

public class PhoneFactory {
	public static PhoneNumber createNewNumber(Scanner s){
		PhoneFormat ph = UserInput.phoneInput(s);
		String number = UserInput.phoneNumberInput(s, ph);
		return new PhoneNumber(ph, number);
	}
}
