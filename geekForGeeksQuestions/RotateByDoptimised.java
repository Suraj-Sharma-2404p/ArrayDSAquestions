/**
 * 
 */
package geekForGeeksQuestions;

import java.util.Scanner;

/**
 * @author Suraj
 *
 */
public class RotateByDoptimised {
	static void reverse(int[] array , int startIndex , int lastIndex) {
		
		while(startIndex<lastIndex) {
			int temp = array[startIndex];
			array[startIndex] = array[lastIndex];
			array[lastIndex] = temp;
			startIndex++ ; lastIndex--;
		}
		
	}
	static void reverseByDgiven(int[] array, int startIndex ,int lastIndex , int d) {
		int size = array.length;
		reverse(array, 0, d-1);
		reverse(array, d , size-1);
		reverse(array, 0, size-1);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("before rotating :");
		for (int i : arr) {
			System.out.print(i+ ",");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("enter the number by which you want to rotate the array :");
		int d = scanner.nextInt();
		scanner.close();
		System.out.println("after reversing by "+ d + " times");
		reverseByDgiven(arr, 0, arr.length-1, d);
		for (int i : arr) {
			System.out.print(i+",");
		}
		
	}

}
