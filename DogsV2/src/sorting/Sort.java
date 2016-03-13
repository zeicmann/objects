package sorting;

import java.util.Comparator;

public class Sort  {
	
	public <E> void selectionSort(E arr[], Comparator<E> param){
		
		for (int i = 0; i<arr.length-1; i++){
			int indMin = i;
			for (int j = i+1; j<arr.length; j++){
				if (param.compare(arr[j], arr[indMin])<=0){
				indMin = j;
			}
			}
			
			if (indMin!=i){
				E temp = arr[indMin];
				arr[indMin] = arr[i];
				arr[i] = temp;
			}
			
		}
	}
}
