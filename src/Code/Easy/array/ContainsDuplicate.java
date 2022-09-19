package Code.Easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean duplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int a : nums) {
			if (set.contains(a)) {
				return true;
			} else {
				set.add(a);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] digits = {1,1,3,4,5};
		boolean majorityElement = ContainsDuplicate.duplicate(digits);
		System.out.println(majorityElement);

	}

}
