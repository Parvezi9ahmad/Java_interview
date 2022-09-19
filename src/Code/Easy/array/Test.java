package Code.Easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : nums) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
              if(entry.getValue()==1) {
            	  System.out.println(entry.getKey()+"      "+entry.getValue());
            	  return entry.getKey();
              }
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] digits = { 3, 2, 3 };
		int majorityElement = Test.majorityElement(digits);
		System.out.println(majorityElement);

	}
}
