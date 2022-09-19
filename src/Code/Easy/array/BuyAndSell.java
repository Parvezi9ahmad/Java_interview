package Code.Easy.array;

public class BuyAndSell {

	public static int BuyAndSell(int[] nums) {

		int beg = nums[0];
		int max = 0;
		int i = 0;
		while (nums.length - 1 > i) {
			i++;
			if (nums[i] - beg < 0) {
				beg = nums[i];
			} else if (nums[i] - beg > max) {
               max=nums[i]-beg;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[] digits = { 7, 1, 5, 3, 6, 4 };
		int plusOne = BuyAndSell.BuyAndSell(digits);
		System.out.println(plusOne);
	}
}
