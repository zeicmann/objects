package main;

import java.util.Scanner;

import record.RecordsList;
import userData.UserInput;

public class StartAddressBook {

	RecordsList records;
	Scanner s;
	
	public static void main(String[] args) {
		StartAddressBook book = new StartAddressBook();
		book.mainloop();
	}
	
	public void mainloop(){
		s = new Scanner(System.in);
		records = new RecordsList();
		int option = 0;
		
		while (option != 3){
			option = UserInput.intInput(s, "1 - add new record, 2 - print all data, 3 - exit");
			switch (option){
				case 1: records.addRecord(s);
						System.out.println("Done!");
						break;
				case 2: records.printRecords();
						break;
				default: break;
			}
		}
	}

}
