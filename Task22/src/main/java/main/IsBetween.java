package main;

public class IsBetween {
	//returns true if entity is between two points even if there are equal and both equal to entity.
	public static <T extends Comparable<T>> boolean check(T a, T b, T c ){
		if (a.compareTo(b)<=0){
			return a.compareTo(c)<= 0 && b.compareTo(c)>=0;
		} else {
			return b.compareTo(c)<= 0 && a.compareTo(c)>=0;
		}
	}
}
