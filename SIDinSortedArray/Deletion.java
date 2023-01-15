package SIDinSortedArray;

import java.util.Scanner;

public class Deletion {
// first we have to search for the index of element to be deleted
	public static int findIndex(int[] array , int element , int firstIndex , int lastIndex) {
		if(firstIndex <= lastIndex) {
			int midIndex = (firstIndex+lastIndex)/2;
			if(array[midIndex] == element) {
				return midIndex;
			}
			else if (array[midIndex] < element) {
				return findIndex(array, element, midIndex+1, lastIndex);
			}
			else {
				return findIndex(array, element, firstIndex, midIndex-1);
			}
		}
		return -1;
	}
	//method to delete element of a sorted array
	public static int deleteNumber(int[] array , int element , int size) {
		int index = findIndex(array, element, 0, array.length-1);
		if(index == -1) {
			System.out.println("the number is not present in array.");
			return size;
		}else {
			for (int i = index; i < array.length-1; i++) {
				array[i] = array[i+1];
			}
			return (size-1);
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number you want to delete : ");
		int element = scanner.nextInt();
		int newsize = deleteNumber(array, element, array.length);
		System.out.println("after deleting the given number :");
		for (int i = 0; i < newsize; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
