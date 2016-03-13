package sorting;

import java.util.Comparator;

import generator.Dog;
import generator.DogSize;

public class SortBySize implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
        DogSize dogSize1 = o1.getSize();
        DogSize dogSize2 = o2.getSize();
        return dogSize1.compareTo(dogSize2);
    }
	
}
