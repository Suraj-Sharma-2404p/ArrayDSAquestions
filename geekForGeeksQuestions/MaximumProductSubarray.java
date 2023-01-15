package geekForGeeksQuestions;

public class MaximumProductSubarray {

	//Brute force solution
	public static int solution(int[] nums) {
		int result = nums[0];
		for(int i = 0 ; i < nums.length ; i++) {
			int product = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				result =  Math.max(result,product);
				  product = product*nums[j];
			}
			result = Math.max(result, product);
		}
		return result;
	}
	
	//optimised solution
	
	public static int solution2(int[] a) {

		  if (a.length == 0) return 0;

		  int max_so_far = a[0];
		  int min_so_far = a[0];
		  int result = max_so_far;

		  for (int i = 1; i < a.length; i++) {
		    int curr = a[i];
		    int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));
		    min_so_far = Math.max(curr, Math.min(max_so_far * curr, min_so_far * curr));

		    max_so_far = temp_max;

		    result = Math.max(max_so_far, result);
		  }

		  return result;
		
		
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {-2,0,-1};
		System.out.println(solution2(nums));
	}
}
