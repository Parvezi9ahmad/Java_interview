package Code.Easy.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		/*
		 * for(int num:nums) { int count=0; for(int n:nums) { if(n==num) { count+=1; } }
		 * return num; }
		 */
		
		Map<Integer,Integer> map=new HashMap<>();
		int length=nums.length/2;
		int count=0;
		for(int a:nums) {
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}
			else {
				map.put(a, 1);
			}
		}

		Map.Entry<Integer, Integer> majorityEntry = null;
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			if(majorityEntry==null ||entry.getValue()>majorityEntry.getValue()) {
				majorityEntry=entry;
				//System.out.println(majorityEntry);
			}
		}
		
		return majorityEntry.getKey();
	}

	public static void main(String[] args) {
		int[] digits = { 2,2,1,1,1,2,2,3,3,3,3,3,3,3 };
		int majorityElement = MajorityElement.majorityElement(digits);
		System.out.println(majorityElement);
	}
}
