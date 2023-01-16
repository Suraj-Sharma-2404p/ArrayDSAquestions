package leetCode;

import java.util.HashMap;

class SingleNumber {
	
    public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hmap.containsKey(nums[i])) {
				int oldFreq = hmap.get(nums[i]);
				int newFreq = oldFreq+1;
				hmap.put(nums[i], newFreq);
			}else {
				hmap.put(nums[i], 1);
			}
		}
		for (int key : hmap.keySet()) {
			if (hmap.get(key) == 1 ) {
				return key;
			}
		}
		return -1;
		
        
    }
    public static void main(String[] args) {
		int[] nums = new int[] {1,1,2,2,3};
		System.out.println(singleNumber(nums));
	}
}
