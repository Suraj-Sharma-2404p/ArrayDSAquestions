package geekForGeeksQuestions;

public class RotateByDbruteForce {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int d = 2;
		for (int i = 0; i < d; i++) {
			int temp = array[0];
			for (int j = 1; j < array.length; j++) {
				array[j - 1] = array[j];
			}
			array[array.length - 1] = temp;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
