package SIDinSortedArray;

import java.util.Scanner;

public class Search {

	public static int searchIndex(int[] array, int element, int first, int last) {
		if (first <= last) {
			int midIndex = first + (last -first)/2;
			if (array[midIndex] == element) {
				return midIndex;
			} else if (array[midIndex] > element) {
				return searchIndex(array, element, first, midIndex - 1);
			} else {
				return searchIndex(array, element, midIndex + 1, last);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number you want to search: ");
		int element = scanner.nextInt();
		int index = searchIndex(array, element, 0, array.length - 1);
		int requiredIndex = array.length;
		if(index == -1) {
			System.out.println("the required number can be inserted at index : "+ requiredIndex);
		}else {
			System.out.println("the element can be found at "+ index);
		}
	}

}

/*
 * In a sorted array, a search operation is performed for the possible position
 * of the given element by using Binary search, and then an insert operation is
 * performed followed by shifting the elements. And in an unsorted array, the
 * insert operation is faster as compared to the sorted array because we don�t
 * have to care about the position at which the element is placed .
 * Time complexity of binary search operation is O(log(n));
 */