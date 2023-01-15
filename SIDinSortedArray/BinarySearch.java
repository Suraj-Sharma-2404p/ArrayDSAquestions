package SIDinSortedArray;

public class BinarySearch {

	static int binarySearch(int[] arr, int low, int high, int element) {
		if (low <= high) {
			int mid = low + (high - low) + 1;
			if (arr[mid] == element) {
				return mid;
			} else if (element > mid) {
				return binarySearch(arr, mid + 1, high, element);
			} else {
				return binarySearch(arr, low, mid - 1, element);
			}
		}
		return -1;
	}

	public static void main(String[] args) {

	}

}
