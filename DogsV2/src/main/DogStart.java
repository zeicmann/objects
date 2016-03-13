package main;

import java.util.Scanner;

import generator.Dog;
import sorting.SortByName;
import sorting.Sort;
import sorting.SortByAge;
import sorting.SortBySize;
import sorting.SortUsingComparable;

public class DogStart {
	
	//vars ------------------------------------
	
	Dog[] dogs;
	Scanner s;
	UserInput input;
	
	//methods ----------------------------------
	public static void main (String[] args){
		DogStart dogStart = new DogStart();
		dogStart.dogsGame();
	}
	
	private void dogsGame(){
		this.s = new Scanner(System.in);
		input = new UserInput();
		input.getUserInput(s);
		this.generateDogsArray(input.getCount(), input.getNames());		
		
		/*
		Sort sort = new Sort();
		sort.selectionSort(this.dogs, new SortByAge().reversed());
		*/
		
		SortUsingComparable sort = new SortUsingComparable();
		sort.selectionSort(this.dogs);
		
		
		for (Dog d: this.dogs){
			System.out.println(d.toString());
		}
	}
	
	private void generateDogsArray(int count, String[] names){
		this.dogs = new Dog[count];
		if (names.length>count){
			System.out.println("Please note that you entered more names that dogs exist. External names won't be used.");
		}
		for (int i = 0 ; i< this.dogs.length; i++){
			if (i<names.length){
				this.dogs[i] = new Dog(names[i]);
			} else this.dogs[i] = new Dog();
		}
	}
}