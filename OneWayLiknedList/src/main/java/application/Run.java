package application;

import java.util.SortedSet;
import java.util.TreeSet;

import linkedList.impl.OneWayLinkedList;
import sorting.ComparatorASC;

public class Run {

	public static void main(String[] args) {
		SortedSet<OneWayLinkedList<String>> set = new TreeSet<>(new ComparatorASC<String>());
		
		OneWayLinkedList<String> list1 = new OneWayLinkedList<>();
		OneWayLinkedList<String> list2 = new OneWayLinkedList<>();
		
		list1.add("asdnk");
		list1.add("asdnk");
		list1.add("csdnk");
		
		list2.add("asdnk");
		list2.add("asdnk");
		list2.add("bjsdf");
		
		set.add(list2);
		set.add(list1);
		
		for (OneWayLinkedList<String> l: set){
			System.out.println(l.toString());
		}
	}

}
