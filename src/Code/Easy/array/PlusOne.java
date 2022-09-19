package Code.Easy.array;

import java.util.Arrays;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}

		int[] outputArr = new int[n + 1];
		outputArr[0] = 1;
		return outputArr;
	}

	public static void main(String[] args) {
		int[] digits = {1,2,3,4,5, 6 };
		int[] plusOne = PlusOne.plusOne(digits);
		System.out.println(Arrays.toString(plusOne));

	}

}
