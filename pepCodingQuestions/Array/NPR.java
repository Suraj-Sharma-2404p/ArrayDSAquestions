package pepCodingQuestions.Array;

import java.util.Scanner;

public class NPR {
	
	public static int fact(int x) {
		int product = 1;
		for(int i= 1 ; i<= x; i++) {
			product = product*i;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number :");
		int n = scanner.nextInt();
		System.out.println("enter number2 :");
		int r = scanner.nextInt();
		
		int nfact = fact(n);
		int n_minusr_fact = fact(n -r);
		int npr = nfact/n_minusr_fact;
		System.out.println(npr);
	}

}
