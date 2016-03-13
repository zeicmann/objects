package main;

import java.util.Scanner;

public class UserInput {
	
	private int dogCount;
	private String[] names;
	
	public String[] getNames(){
		return names;
	}
	
	public int getCount(){
		return this.dogCount;
	}
	
	public void getUserInput(Scanner s){
		
		System.out.println("Input your data. 1st arg is count of dogs. 2nd and the nexts are dog names.");
		boolean isPutted = false;
		boolean isInt = false;
		
		while (isPutted == false){
			String temp = s.nextLine();
			String[] dataTemp = temp.trim().split(" ");
			
			if (temp.isEmpty()) {
				System.out.println("You should input smth. Please try again"); //verifies that inputed string is not empty
			} else {
				try { // verifies that 1st arg is int
					this.dogCount = Integer.parseInt(dataTemp[0]);
					isInt = true;
					} catch (NumberFormatException e) {
						System.out.println("1st arg should be integer");
						} 
				if (isInt == true){
					names = new String [dataTemp.length-1];
					for (int i = 1 ; i< dataTemp.length; i++){
						this.names[i-1] = dataTemp[i];
					}
					isPutted = true;
				}				
			}
		}
	}
}
