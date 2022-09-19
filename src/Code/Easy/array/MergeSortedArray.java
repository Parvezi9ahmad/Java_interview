package Code.Easy.array;

import java.util.Arrays;

public class MergeSortedArray {
	
	//Best solution
	/*
	 * public static void merge(int[] nums1, int m, int[] nums2, int n) { if (nums1
	 * == null || nums2 == null || n == 0) { return; }
	 * 
	 * int ptr1 = nums1.length - 1; int ptr2 = nums2.length - 1; int curr =
	 * nums1.length + nums2.length - 1; int[] arr = new int[curr + 1];
	 * 
	 * while (ptr1 >= 0 && ptr2 >= 0) { if (nums1[ptr1] > nums2[ptr2]) { arr[curr] =
	 * nums1[ptr1]; ptr1--; curr--; } else { arr[curr] = nums2[ptr2]; ptr2--;
	 * curr--; } }
	 * 
	 * while (ptr1 >= 0) { arr[curr] = nums2[ptr1]; curr--; ptr2--; }
	 * 
	 * System.out.println("Inside test class " + Arrays.toString(arr)); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * int[] nums1 = { 1, 2, 3, 4, 8, 9 }; int[] nums2 = { 0 }; int m = 3; int n =
	 * 1; Test.merge(nums1, m, nums2, n); }
	 */

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1 == null || nums2 == null || n == 0) {
			return;
		}

		int ptr1 = m - 1;
		int ptr2 = n - 1;
		int curr = m + n - 1;
		int[] arr = new int[curr + 1];

		while (ptr1 >= 0 && ptr2 >= 0) {
			if (nums1[ptr1] > nums2[ptr2]) {
				arr[curr] = nums1[ptr1];
				ptr1--;
				curr--;
			} else {
				arr[curr] = nums2[ptr2];
				ptr2--;
				curr--;
			}
		}

		while (ptr2 >= 0) {
			arr[curr] = nums2[ptr2];
			curr--;
			ptr2--;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 4, 0, 0 };
		int[] nums2 = { 4,6,9 };
		int m = 3;
		int n = 1;
		MergeSortedArray.merge(nums1, m, nums2, n);
	}
}
