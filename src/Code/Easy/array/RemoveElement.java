package Code.Easy.array;

import java.util.Arrays;

public class RemoveElement {

	/*
	 * public static int removeElement(int[] nums, int val) {
	 * 
	 * if (nums.length == 0) { return 0; } else {
	 * 
	 * int i = 0; for (int j = 0; j < nums.length; j++) { if (nums[j] != val) {
	 * 
	 * nums[i] = nums[j]; i++; } } System.out.println(Arrays.toString(nums)); return
	 * i; } }
	 */

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				// reduce array size by one
				n--;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return n;
	}

	public static void main(String[] args) {
		// int[] nums= {3,2,2,3};
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int val = 2;
		int removeElement = RemoveElement.removeElement(nums, val);
		System.out.println(removeElement);
	}

}
