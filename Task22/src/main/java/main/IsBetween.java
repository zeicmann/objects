package main;

public class IsBetween {
	//returns true if entity is between two points. If it's equals it doesn't onside not inside so returns false;
	public static <T extends Comparable<T>> boolean check(T a, T b, T c ){
		if (a.compareTo(b)<=0){
			return a.compareTo(c)< 0 && b.compareTo(c)>0;
		} else {
			return b.compareTo(c)< 0 && a.compareTo(c)>0;
		}
	}
}
