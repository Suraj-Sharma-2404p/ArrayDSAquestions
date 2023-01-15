package geekForGeeksQuestions;

public class RotateRightByDBrute {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 5, 6, 7, 8, 9 };
		int d = 13; 
		for (int i = 0; i < (d%array.length) ; i++) {
			int temp = array[array.length-1];
			for (int j = array.length-2; j >= 0 ; j--) {
				array[j+1] = array[j];
			}
			array[0] = temp;
		}
		for (int i : array) {
			System.out.print(i+ " ");
		}
	}
}
