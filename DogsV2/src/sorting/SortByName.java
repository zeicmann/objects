package sorting;

import java.util.Comparator;

import generator.Dog;

public class SortByName implements Comparator<Dog>{
	
	@Override
	public int compare(Dog o1, Dog o2) {
		String dogName1 = o1.getName();
		String dogName2 = o2.getName();
		return dogName1.compareTo(dogName2);
    }
}
