package userData;

import java.util.Scanner;

import format.AddressFormat;
import format.PhoneFormat;

public class UserInput {
	
	//-----------------------------------------------------------------------------------------
	public static AddressFormat countryInput(Scanner s){
		//Print countries info:
		boolean isPutted = false;
		String temp = null;
		while (isPutted == false){
			
			System.out.println("Select one of the following countries:");
			
			for (AddressFormat c: AddressFormat.values()){
				System.out.println(c.toString());
			}
			
			temp = s.nextLine();
			
			for (AddressFormat c: AddressFormat.values()){
				if (c.toString().compareTo(temp) == 0){
					isPutted = true;
					break;
				}
			}
			
			if (isPutted == true){
				break;
			}
			
			System.out.println("Format that you specified is not valid. Please try again.");
		}
		
		return AddressFormat.valueOf(temp);
	}
	
	//-----------------------------------------------------------------------------------------
	public static PhoneFormat phoneInput(Scanner s){
		//Print formats info:
		boolean isPutted = false;
		String temp = null;
		while (isPutted == false){
		System.out.println("Select one of the following phone format:");
		for (PhoneFormat ph: PhoneFormat.values()){
			System.out.println(ph.toString());
		}
		
		temp = s.nextLine();
		
		for (PhoneFormat ph: PhoneFormat.values()){
			if (ph.toString().compareTo(temp) == 0){
				isPutted = true;
				break;
			}
		}
		
		if (isPutted == true){
			break;
		}
		
		}
		return PhoneFormat.valueOf(temp);
	}
	
	//-----------------------------------------------------------------------------------------
	public static String stringInput(Scanner s, String text){
		System.out.println(text);
		String temp = s.nextLine();
		return temp;
	}
	
	//-----------------------------------------------------------------------------------------
	
	public static String phoneNumberInput(Scanner s, PhoneFormat ph){
		System.out.println("Please specify phone number." + 
				"It should be " + ph.getDigits() +" digits.");
		String temp = null;
		boolean isPutted = false;
		boolean isNumber = false;
		while (isPutted == false){
			temp = s.nextLine();
			for (int i = 0; i<temp.length(); i++){
				try{
					Integer.parseInt(temp.substring(i, i+1));
					isNumber = true;
				} catch (NumberFormatException e){
					System.out.println("Number accepts only integers!");
					isNumber = false;
					break;
				}
			}
			
			if (temp.length() != ph.getDigits()){
				System.out.println("Number has incorrect length. It should be " + ph.getDigits() + " digits.");
			}
			
			if (temp.length() == ph.getDigits() && isNumber == true){
				isPutted = true;
			} 
				
			}
		return temp;
	}
	
	//-----------------------------------------------------------------------------------------
	
	public static int intInput(Scanner s, String text){ // no verifications for this. I'm bored. Will do it later:)
		System.out.println(text);
		String temp = s.nextLine();
		return Integer.parseInt(temp);
	}
	
}
