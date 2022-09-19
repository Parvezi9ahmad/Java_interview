package Code.Easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// 1-using brute force
	/*
	 * public static int[] twoSum(int[] nums,int target) { for(int
	 * i=0;i<nums.length;i++) { for(int j=i+1;j<nums.length;j++) {
	 * if(nums[j]==target-nums[i]) { return new int[] {i,j}; } } }
	 * 
	 * return null;
	 * 
	 * }
	 */

	// 2: Two-pass Hash Table

	/*
	 * public static int[] twoSum(int[] nums, int target) { Map<Integer, Integer>
	 * map = new HashMap<>(); for (int i = 0; i < nums.length; i++) {
	 * map.put(nums[i], i); } for (int i = 0; i < nums.length; i++) { int complement
	 * = target - nums[i]; if (map.containsKey(complement) && map.get(complement) !=
	 * i) { System.out.println(map.get(complement) != i); return new int[] { i,
	 * map.get(complement) }; } }
	 * 
	 * return null; }
	 */

	// One-pass Hash Table
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println(map.get(complement));
				return new int[] { map.get(complement), i };

			}
			map.put(nums[i], i);
		}

		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] twoSum = TwoSum.twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));

	}

}
