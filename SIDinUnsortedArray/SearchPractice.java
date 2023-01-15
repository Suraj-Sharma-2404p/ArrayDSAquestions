package SIDinUnsortedArray;

public class SearchPractice {
	
	public static int index(int[] array , int size , int element) {
		for (int i = 0; i < size-1; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		int size = array.length;
		int element = 2;
		int index = index(array, size, element);
		System.out.println(index);
	}
}
