/**
 * 
 */
package geekForGeeksQuestions;

//Write a java program to return minimum and maximum in an array. Your program should make the minimum number of comparisons. 
//Java doesn’t support multi-value returns.
public class MaxMinInArrary {
	// Method 1 : using Linear Search
	/*
	 * public static class Pair { int min; int max; } static Pair getMinMax(int[]
	 * array ,int size) { Pair minMax = new Pair(); if(size ==1) { minMax.min =
	 * array[0]; minMax.max = array[0]; return minMax; }else { if(array[0] >
	 * array[1]) { minMax.min = array[1]; minMax.max = array[0]; }else { minMax.min
	 * = array[0]; minMax.max = array[1]; } } for (int i = 2; i < size; i++) { if
	 * (array[i] > minMax.max) { minMax.max = array[i]; }else if (array[i] <
	 * minMax.min) { minMax.min = array[i]; } } return minMax; }
	 */

	// Time Complexity: O(n)

	// Auxiliary Space: O(1) as no extra space was needed.
//#####################################################################################################################//
	// Method : 2 //

	// maxmin using binary search or tournament method.

	static class Pair {
		int max;
		int min;
	}

	static Pair getMinMax(int[] array, int low, int high) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		// if there is only one element.
		if (low == high) {
			minmax.max = array[low];
			minmax.min = array[low];
			return minmax;
		}

		// if there are two elements.
		if (high == low + 1) {
			if (array[low] > array[high]) {
				minmax.max = array[low];
				minmax.min = array[high];
			} else {
				minmax.max = array[low];
				minmax.min = array[high];
			}
			return minmax;
		}

		// if there are more than two elements.
		mid = (low + high) / 2;
		mml = getMinMax(array, low, mid);
		mmr = getMinMax(array, mid + 1, high);

		// comparing minimum of two parts.

		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		// comparing maximum of two parts.

		if (mmr.max > mml.max) {
			minmax.max = mmr.max;
		} else {
			minmax.max = mml.max;
		}

		return minmax;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int size = array.length;
		// Pair pair = getMinMax(array, size);
		Pair pair = getMinMax(array, 0, size - 1);
		System.err.println("minimum element is :" + pair.min);
		System.err.println("maximum element is :" + pair.max);
	}
}
