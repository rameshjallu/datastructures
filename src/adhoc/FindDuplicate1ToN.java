package adhoc;

import java.util.Arrays;

public class FindDuplicate1ToN {

	
	public static void main(String[] args) {
		
		int[] nums={1,2,3,4,5,6,7,8,7};
		
		for(int i=0;i<nums.length;i++){
			nums[nums[i]]=0;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
