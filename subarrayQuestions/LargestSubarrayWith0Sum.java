package subarrayQuestions;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {		
	static int solution(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int mlen = 0;
		int i = -1;
		int sum = 0;
		map.put(sum, i);
		while(i < array.length-1) {
			i++;
			sum += array[i];
			if (map.containsKey(sum) == false) {
				map.put(sum, i);
			}else {
				int len = i - map.get(sum);
				 if (len > mlen) {
					mlen = len;
				}
			}
		}
		return mlen;
	}
	public static void main(String[] args) {
		int[] array = new int[] {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		System.out.println(solution(array));
	}

}
