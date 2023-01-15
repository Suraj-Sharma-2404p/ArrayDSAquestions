package geekForGeeksQuestions;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithKsum {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,6,0,5,6,0};
		int k = 6;
		boolean found = false;
		int count= 0;  // to check how many times sum is 3;
		
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		for (int element: array) {
			set.add(sum);
			sum += element;
			if(set.contains(sum-k)) {
				found = true;
				count++;
			}
		}
		System.out.println(found);
		System.out.println(count);
	}
}
