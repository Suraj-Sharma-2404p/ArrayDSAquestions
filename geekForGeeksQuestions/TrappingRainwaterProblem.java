package geekForGeeksQuestions;

public class TrappingRainwaterProblem {
	
	public static int rainwater(int nums[]) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		left[0] = nums[0];
		right[nums.length-1] = nums[nums.length-1];
		// traversing nums from left to find left array
		
		for (int i = 1; i < nums.length; i++) {
			left[i] = Math.max(nums[i], left[i-1]);
		}
		
		// traversing from right to find right array 
		
		for (int i = nums.length-2 ; i >= 0 ; i--) {
			right[i] = Math.max(nums[i], right[i+1]);
		}
		int ans = 0 ;
		for (int i = 0; i < nums.length; i++) {
			ans +=( Math.min(left[i], right[i]) - nums[i]);
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {3,1,2,4,0,1,3,2};
		System.out.println(rainwater(nums));
	}

}
