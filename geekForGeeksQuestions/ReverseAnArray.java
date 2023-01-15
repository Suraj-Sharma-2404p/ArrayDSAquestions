package geekForGeeksQuestions;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6};
		for(int i =0 ; i<array.length-1 ;i++) {   
			array[i] = array[(array.length-1)-i];
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
