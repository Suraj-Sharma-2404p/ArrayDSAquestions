package pepCodingQuestions.Array;

import java.util.Scanner;

public class Digit_frequency_In_a_number {
	public static int getDigits(int n , int d) {
		int returnValue = 0;
		while(n>0) {
			int dig = n % 10;
			n = n /10;
			
			if(dig == d) {
				returnValue++;
			}
		}
		return returnValue;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int f = getDigits(n, d);
		System.out.println(f);
		
	}

}
