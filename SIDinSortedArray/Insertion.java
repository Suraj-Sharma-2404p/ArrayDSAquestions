package SIDinSortedArray;

public class Insertion {
	static int insertInSortedArray(int[] array, int size , int element , int capacity) {
		if(size >= capacity) {
			return size;
		}
		int i;
		for(i = size-1; (i>= 0 && array[i] > element); i--) {
			array[i+1] = array[i];
		}
		array[i+1] = element;
		return (size+1);
		
	}
	public static void main(String[] args) {
		
		int[] array = new int[20];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 5;
		array[4] = 7;
		array[5] = 8;
		
		
		int capacity = array.length;
		int size = 6;
		int element = 4;
		System.out.println("before insertion :");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		int newSize = insertInSortedArray(array, size, element, capacity);
		System.out.println("after insertion : ");
		for (int i = 0; i < newSize; i++) {
			System.out.print(array[i]+ " ");
		}
		
	}

}
