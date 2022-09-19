package Code.Easy.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : nums) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				int key = entry.getKey();
				return key;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] digits = { 4, 1, 2, 1, 2 };
		int plusOne = SingleNumber.singleNumber(digits);
		System.out.println(plusOne);

	}

}
