package main;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import address.AddressData;
import address.AddressFactory;

public class CreateAddressAndPrint {
	
	Scanner s;
	AddressData address;
	
	@Before
	public void setUp(){
		s = new Scanner(System.in);
	}

	@Test
	public void test() {
		AddressData address = AddressFactory.createNewAddress(s);
		System.out.println(address.getAddress());
	}
	
	@Test
	public void test2() {
		AddressData address = AddressFactory.createNewAddress(s);
		System.out.println(address.getAddress());
	}
}
