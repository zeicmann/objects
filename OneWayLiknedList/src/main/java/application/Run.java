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
		
		String str1 = "asdnk asdnk asdnk";
		String str2 = "asdnk bjsdf";
		
		String[] str1Data = str1.trim().split(" ");
		String[] str2Data = str2.trim().split(" ");
		
		Run.addToList(list1, str1Data);
		Run.addToList(list2, str2Data);
		
		set.add(list2);
		set.add(list1);
		
		for (OneWayLinkedList<String> l: set){
			System.out.println(l.toString());
		}
	}
	
	public static <E> void addToList(OneWayLinkedList<E> list, E[] elements){
		for (E e: elements){
			list.add(e);
		}
	}
}
