package geekForGeeksQuestions;
//reversing an array using recursion
public class ReverseTheArrayBabbar {
	
	//without recursion reversing of an array
	public static void reverseArray(int[] array ,int si , int li) {
		int temp;
		if(si>=li) {
			return;
		}else {
			while(si<li) {
				temp = array[si];
				array[si] = array[li];
				array[li] = temp;
				si++; li--;
			}
			
		}
	}
	
	//reversing an array using recursion
	public static void reverseArrayRecursion(int[] array,int si , int li) {
		int temp;
		if(si>=li) {
			return;
		}
		else {
			temp = array[si];
			array[si] = array[li];
			array[li] = temp;
			reverseArrayRecursion(array, si+1, li-1);
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6};
		for (int i : array) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//reverseArray(array, 0, array.length-1);
		reverseArrayRecursion(array, 0, array.length-1);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
