package geekForGeeksQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	// method 1:
	static boolean solution(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	//method 2:
	
	static boolean solution2(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] == array[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	//method 3(best approach)
	static boolean solution3(int[] array) {
		if (array == null || array.length == 0) {
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer integer : array) {
			if (!set.add(integer)) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3};
		System.out.println(solution3(array));
	}

}
