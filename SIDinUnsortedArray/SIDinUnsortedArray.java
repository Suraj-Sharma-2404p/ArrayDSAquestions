package SIDinUnsortedArray;

public class SIDinUnsortedArray {

	// function to implement search operation in array
	public static int findElement(int arr[], int size, int element) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// function to insert element in an unsorted array
	public static int insertUnsorted(int array[], int size, int element, int capacity) {
		// can not insert more element if size is already more than or equal to
		// capacity.
		if (size >= capacity) {
			return size;
		}
		array[size] = element;
		return (size + 1);
	}
	
	//function to delete element in an unsorted array
	public static int findElementToDelete(int array[], int size , int element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
	}
	// delete after finding the element
	public static int deleteFoundElement(int array[], int size , int element) {
		int positionOfElementToBeDeleted = findElementToDelete(array, size, element);
		if (positionOfElementToBeDeleted == -1) {
			System.out.println("number not found");
			return size;
		}else {
			for (int i = 0; i < size-1 ; i++) {
				array[i] = array[i+1];
			}
		}
		return (size-1);
	}

	public static void main(String[] args) {
		int[] array = { 12, 34, 14, 18, 17 }; // unsorted array
		int size = array.length;
		int element = 34;
		int position = findElement(array, size, element);
		if (position == 1) {
			System.out.println("number is found at index " + position);
		} else {
			System.out.println("number not present in array");
		}
		int[] array2 = new int[20];
		array2[0] = 12;
		array2[1] = 11;
		array2[2] = 10;
		array2[3] = 13;
		array2[4] = 14;
		array2[5] = 15;
		System.out.println("before insertion : ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
			System.out.println();
		}

		System.out.println("no to be inserted is 24");
		int element2 = 24;
		int size2 = 6;
		int capacity = 20;
		int newsize = insertUnsorted(array2, size2, element2, capacity);
		System.out.println("after insertion : ");
		for (int i = 0; i < newsize; i++) {
			System.out.print(array2[i] + " ");
		}
		
		int[] array3 = {1,3,2,4,6,5,7};
		int size3 = array3.length;
		int element3 = 2;
		System.out.println();
		System.out.println("no to be deleted is 2");
		System.out.println();
		System.out.println("array before deletion :");
		for (int i = 0; i < size3; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println("array after deletion : ");
		int newsize2 = deleteFoundElement(array3, size3, element3);
		for (int i = 0; i < newsize2; i++) {
			System.out.print(array3[i]+ " ");
		}
	}
}

//In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element. 
//In the delete operation, the element to be deleted is searched using the linear search, and then delete operation is performed followed by shifting the elements. 