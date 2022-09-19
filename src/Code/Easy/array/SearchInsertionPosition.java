package Code.Easy.array;

public class SearchInsertionPosition {
	public static int searchInsert(int[] nums,int target) {
		int n=nums.length;
		for(int i=0;i<n;i++) {
			if(nums[i]>=target) {
				return i;
				
			}
		}
		
		return 0;
		
	}

	public static void main(String[] args) {

		int[] nums= {1 , 3 , 5 , 6};
		int target=6;
		int searchInsert = SearchInsertionPosition.searchInsert(nums,target);
		System.out.println(searchInsert);
	}

}
