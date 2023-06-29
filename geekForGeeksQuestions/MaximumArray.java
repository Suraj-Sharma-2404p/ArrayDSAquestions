package geekForGeeksQuestions;

// this is also the implementation of Kadene's algorithm.
public class MaximumArray {

	static int maxSubArraySum(int[] array , int size) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			currentSum += array[i];
			if (currentSum> maxSum) {
				maxSum = currentSum;
			}
			if (currentSum<0) {
				currentSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		
		int array[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArraySum(array, array.length));
	}
}
