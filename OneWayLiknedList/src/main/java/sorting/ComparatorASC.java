package sorting;

import java.util.Comparator;

import linkedList.impl.OneWayLinkedList;

public class ComparatorASC<T extends Comparable<T>> implements Comparator<OneWayLinkedList<T>>{

	@Override
	public int compare(OneWayLinkedList<T> list1, OneWayLinkedList<T> list2) {
		return list1.compareTo(list2);
		}

}
