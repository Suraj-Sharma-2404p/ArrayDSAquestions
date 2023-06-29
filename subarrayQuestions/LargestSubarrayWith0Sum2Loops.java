package subarrayQuestions;

public class LargestSubarrayWith0Sum2Loops {
	static int largestSubarrayWith0Sum(int[] arr) {
		int maxLength = 0;
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++) {
			int subArraySum = 0;
			for(int j = i; j< n ;j++) {
				subArraySum += arr[j];
				if(subArraySum == 0) {
					maxLength = Math.max(maxLength, j-i+1);  //here is the catch j-i+1
				}
			}
			
		}
		return maxLength;
	}
	public static void main(String[] args) {
		int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(largestSubarrayWith0Sum(a));
	}

}
