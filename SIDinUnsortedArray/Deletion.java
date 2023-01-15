package SIDinUnsortedArray;

public class Deletion {

	//method to find the index of number to be deleted
	public static int findNumber(int array[] , int size , int element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	//method to delete the number found
	public static int deleteNumber(int array[], int size , int element) {
		int index = findNumber(array, size, element);
		if (index == -1) {
			System.out.println("number not found");
			return size;
		}else {
			for (int i = index; i < size-1; i++) {
				array[i] = array[i+1];
			}
		}
		return (size-1);
	}
	public static void main(String[] args) {
		
		int[] array = {1,3,2,4,5,7,6};
		System.out.println("before deletion : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
		 int size = array.length;
		 int element = 2;
		 int newSize = deleteNumber(array, size, element);
		 System.out.println();
		 System.out.println("after deletion :");
		 for (int i = 0; i < newSize; i++) {
			System.out.print(array[i]+ ",");
		}

	}

}
