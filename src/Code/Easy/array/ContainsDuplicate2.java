package Code.Easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) 
	{
		HashMap<Integer, Integer> mp = new HashMap<>();

		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(mp.get(nums[i]));
			if(mp.get(nums[i])==null)
				mp.put(nums[i],i);
			else
			{
				if(i-(mp.get(nums[i]))<=k) {
					return true;
				}
				else
					mp.put(nums[i],i);
			}
		}
		return false;

	}

	public static void main(String[] args) {

		int[] nums = { 1,0,1,1};
		boolean containsNearbyDuplicate = ContainsDuplicate2.containsNearbyDuplicate(nums,1 );
		System.out.println(containsNearbyDuplicate);
	}
}
