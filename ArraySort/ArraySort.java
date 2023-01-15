package ArraySort;

import java.util.Arrays;

public class ArraySort {
	
	//implementing search 
	public static int search(int array[], int element) {
		for(int i = 0 ; i< array.length ; i++) {
			if(array[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a1[] = new int[] {3,2,4,1,54,34};
		for(int i = 0;i <a1.length ; i++) {
			System.out.print(a1[i] + " ");
		}
		Arrays.sort(a1);
		System.out.println();
		for(int i = 0;i <a1.length ; i++) {
			System.out.print(a1[i]+ " ");
		}
		
		int index = search(a1,3);
		if (index == -1) {
			System.out.println("element not found");
		}
		else
			System.out.println("element is found at index " + index);
		
	}

}
