package SIDinSortedArray;

public class DeletionPrctice {
	
	static int binarySearch(int[] arr , int low , int high , int element) {
		
		if(low <= high) {
			int mid  = low + (high - low)/2;
			if(element == arr[mid]) {
				return mid;
			}else if (element > mid) {
				return binarySearch(arr, mid+1, high, element);
			}else {
				return binarySearch(arr, low, mid-1, element);
			}
		}
		return -1;
	}
	
	static int delete(int[] arr , int element) {
		int index = binarySearch(arr, 0, arr.length-1, element);
		if(index == -1) {
			System.out.println("number not present in the array");
		}
		for(int j = index ; j < arr.length-1 ; j++) {
			arr[j] = arr[j+1];
		}
		return arr.length-1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,6,5};
		//System.out.println(binarySearch(arr, 0, arr.length-1, 0));
		int newSize = delete(arr, 4);
		for (int i = 0; i < newSize; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
	}
}
