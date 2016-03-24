package main;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import phone.PhoneFactory;
import phone.PhoneNumber;

public class CreatePhone {

	Scanner s;
	PhoneNumber phone;
	
	@Before
	public void setUp(){
		s = new Scanner(System.in);
	}
	
	@Test
	public void test() {
		PhoneNumber phone = PhoneFactory.createNewNumber(s);
		System.out.println(phone.getNumber());
	}

}
