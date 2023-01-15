package geekForGeeksQuestions;

public class RotateRightByDOptimised {

	static void reverse(int[] array, int startIndex, int lastIndex) {
		try {
			while (startIndex > lastIndex) {
				int temp = array[startIndex];
				array[startIndex] = array[lastIndex];
				array[lastIndex] = temp;
				startIndex++;
				lastIndex--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void reverseByDgiven(int[] array, int startIndex, int lastIndex, int d) {
		reverse(array, array.length - 1, d-1);
		reverse(array, array.length - d, 0);
		reverse(array, 0, array.length - 1);
	}

	public static void main(String[] args) {
		try {
			int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
			reverseByDgiven(array, 0, array.length - 1, 2);
			for (int i : array) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
