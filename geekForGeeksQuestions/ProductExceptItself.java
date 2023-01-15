package geekForGeeksQuestions;

public class ProductExceptItself {
	public static int[] productExceptSelf(int[] nums) {
		int[] responseArray = new int[nums.length];
		int[] leftProduct = new int[nums.length];
		int[] rightProduct = new int[nums.length];
		int response = 1;
		try {
			for (int i = 0; i < nums.length; i++) {
				leftProduct[i] = response * nums[i - 1];
			}
			for (int i : leftProduct) {
				System.out.println(i);
			}
			for (int i : rightProduct) {
				System.out.println(i);
			}
			for (int i = nums.length - 1; i >= 0; i--) {
				rightProduct[i] = response * nums[i + 1];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseArray;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		int[] responseArray = new int[nums.length];
		int response = 1;
		
	}

}
