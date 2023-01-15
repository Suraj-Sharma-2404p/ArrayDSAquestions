package SIDinSortedArray;

import java.util.Scanner;

public class InsertionPractice {

	public static int insertIntoSortedArray(int[] array, int size, int element, int capacity) {
		int i;
		if (size > capacity) {
			return size;
		} else {
			for (i = size - 1; (i > 0 && array[i] > element); i--) {
				array[i + 1] = array[i];
			}
			array[i + 1] = element;
			System.out.println("the index at which the element will be inserted is: "+ (i+1));
		}
		return (size + 1);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] array = new int[20];
		array[0] = 1;
		array[1] = 5;
		array[2] = 7;
		array[3] = 8;
		array[4] = 10;
		array[5] = 17;
		array[6] = 20;
		int size =7;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number you want to insert : ");
		int element = scanner.nextInt();
		int newSizeOfArray = insertIntoSortedArray(array, size, element, array.length);
		System.out.println("array after insertion is : ");
		for (int i = 0; i < newSizeOfArray; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
