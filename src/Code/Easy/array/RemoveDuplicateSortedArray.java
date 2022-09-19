package Code.Easy.array;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} else {
			int i = 0;
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] != nums[j]) {
					i++;
					nums[i] = nums[j];
				}
			}
			return i+1;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 3, 3, 4, 4, 4 };
		System.out.println(Arrays.toString(nums));
		int removeDuplicates = RemoveDuplicateSortedArray.removeDuplicates(nums);
		System.out.println(removeDuplicates);
		System.out.println(Arrays.toString(nums));

	}

}
