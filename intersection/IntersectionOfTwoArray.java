package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArray {

//	static void intersection(int[] arr1, int[] arr2) {
//		boolean found = false;
//		Stack<Integer> stack = new Stack<>();
//		for (int i = 0; i < arr1.length; i++) {
//			stack.add(arr1[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			if (arr2[i] == stack.pop()) {
//				found = true;
//				System.out.println("intersection is at" + arr2[i]);
//
//			}
//		}
//
//	}

	public static String[] intersectHashSet(String[] arr1, String[] arr2) {
		HashSet<String> set = new HashSet<>(Arrays.asList(arr1));
		set.retainAll(Arrays.asList(arr2));
		return set.toArray(new String[0]);
	}
	public static String[] intersectStream(String[] arr1, String[] arr2){
	    return Arrays.stream(arr1)
	            .distinct()
	            .filter(x -> Arrays.asList(arr2).contains(x))
	            .toArray(String[]::new);
	}
	//best method
	public static String[] intersectHashMap(String[] arr1, String[] arr2){
	    HashMap<String, Integer> map = new HashMap<>();
	    for (int i = 0; i < arr1.length; i++)
	        map.put(arr1[i], 1);

	    ArrayList<String> result = new ArrayList<>();
	    for(int i = 0; i < arr2.length; i++)
	        if(map.containsKey(arr2[i]))
	            result.add(arr2[i]);
	    return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] arr1 = new String[] { "1", "2", "3", "4", "5" };
		String[] arr2 = new String[] { "2", "8", "9", "0", "90" };
		// intersection(arr1, arr2);
		String[] str = new String[] {};
		str = intersectHashMap(arr1, arr2);
		System.out.println(Arrays.toString(str));
	}

}
