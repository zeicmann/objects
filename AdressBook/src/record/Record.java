package record;

import address.AddressData;
import phone.PhoneNumber;

public class Record {
	AddressData address;
	PhoneNumber number;
	String name;
	
	Record (String name, AddressData address, PhoneNumber number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	@Override
	public String toString(){
		return "Name: " + this.getName() + " | " + this.address.getAddress() + " | " + this.number.getNumber();
	}
	
	//getters
	public String getName(){
		return this.name;
	}
	
	//print
	public void printName(){
		System.out.println(this.getName());
	}
	
	public void printAddress(){
		System.out.println(this.address.getAddress());
	}
	
	public void printPhoneNumber(){
		System.out.println(this.number.getNumber());
	}
}
