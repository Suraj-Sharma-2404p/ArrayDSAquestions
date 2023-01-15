package geekForGeeksQuestions;

public class MinofArray {

	static int minOfArray(int[] array) {
		int min = array[0];
		for (int i=0; i<array.length-1;i++) {
			if(array[i+1] < array[0]) {
				min = array[i+1];
			}
		}
		return min;
	}
	
	/**
	 * @param array
	 * @return
	 */
	static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i = 0 ; i < array.length-1;i++) {
			if(array[i+1]> max) {
				max = array[i+1];
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {-1,0,-3,-4,-5,-6};
		System.out.println(maxOfArray(array));
	}

}
