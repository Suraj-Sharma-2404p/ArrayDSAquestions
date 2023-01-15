package geekForGeeksQuestions;

import java.util.Arrays;

public class ChocolateDistribution {

	static int solution(int[] array , int size , int noOfStudent) {
		
		Arrays.sort(array);
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i + noOfStudent-1 < size ; i++) {
			int difference = array[i+noOfStudent-1]-array[i];
			if (difference< min) {
				min = difference;
			}
		}
		return min;
		
		
	}
	
	public static void main(String[] args) {
		
		int []  array = new int[] {12, 4,  7,  9,  2,  23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50};
		System.out.println(solution(array, array.length, 7));
		
	}
}
