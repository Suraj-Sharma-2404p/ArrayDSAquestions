package geekForGeeksQuestions;

public class Reverse {
	
	static void reverseUsingRecursion(int[] a ,int si , int li) {
		if (si <= li) {
			int temp = a[si];
			a[si] = a [li];
			a[li] = temp;
			reverseUsingRecursion(a, si+1, li-1);
		}
	}
	
	public static void main(String[] args) {
		int [] a = new int[] {4,3,2,1};
		//
		reverseUsingRecursion(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
