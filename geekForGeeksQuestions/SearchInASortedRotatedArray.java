package geekForGeeksQuestions;

public class SearchInASortedRotatedArray {

	static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid]) {
				return mid;
			}
			if (array[low] <= array[mid]) {     // ' = 'checks the condition when array has only 2 elements.
				if (key >= array[low] && key < array[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (key > array[mid] && key <= array[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] {4,1};
		System.out.println(binarySearch(array, 0));
	}
}
