package sorting;

import java.util.Comparator;

import generator.Dog;

public class SortByAge implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		return (age1>=age2)? 1: -1;
	}
	
}
