package SIDinSortedArray;

public class DeletionPractice {
	
	public static int indexOfNumberToBeDeleted(int[] array , int first , int last , int element) {
		if(first <= last) {
			int mid = (first+last)/2;
			if(array[mid] == element) {
				return mid;
			}
			else if (array[mid] > element) {
				return indexOfNumberToBeDeleted(array, first, mid-1, element);
			}
			else if (array[mid]< element ) {
				return indexOfNumberToBeDeleted(array, mid+1, last, element);
			}
		}
		return -1;
	}
	public static int deleteInSortedArray(int[] array, int size, int element) {
		int indexOfNumberToBeDeleted = indexOfNumberToBeDeleted(array, 0, size-1, element);
		if(indexOfNumberToBeDeleted == -1) {
			System.out.println("number not found");
			return size;
		}
		for(int i = indexOfNumberToBeDeleted ; i < array.length-1 ; i++) {
			array[i] = array[i+1];
		}
		return (size-1);

	}

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6};
		//int index = indexOfNumberToBeDeleted(array, 0, array.length-1, 2);
		int newSize = deleteInSortedArray(array, array.length, 7);
		for (int i = 0; i < newSize; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
