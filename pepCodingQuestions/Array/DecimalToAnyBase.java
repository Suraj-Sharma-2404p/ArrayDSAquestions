package pepCodingQuestions.Array;

import java.util.Scanner;

public class DecimalToAnyBase {
	
	public static int solution(int number , int base) {
		int rv = 0;
		int i =1;
		while(number > 0) {
			int dig = number % base;
			number = number / base;
			rv +=  dig* i;
			i = i * 10;
		}
		return rv;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt()	;
		int base = scanner.nextInt()	;
		int ans = solution(number, base);
		System.out.println(ans);
	}

}
