package sorting;

public class SortUsingComparable  {
	
	public <T extends Comparable<Object>> void selectionSort(T[] arr){
		
		for (int i = 0; i<arr.length-1; i++){
			int indMin = i;
			for (int j = i+1; j<arr.length; j++){
				if (arr[j].compareTo(arr[indMin])<=0){
				indMin = j;
			}
			}
			
			if (indMin!=i){
				T temp = arr[indMin];
				arr[indMin] = arr[i];
				arr[i] = temp;
			}
			
		}
	}
}
