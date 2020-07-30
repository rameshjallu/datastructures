package adhoc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * [1,2,0] Output: 3
		 * 
		 * 
		 * Input: [3,4,-1,1] Output: 2
		 * 
		 * 
		 * Input: [7,8,9,11,12] Output: 1
		 */

		int[] nums = { 7,8,9,11,12,1,2};

		System.out.println(firstMissingPositive(nums));

	}

	public static int firstMissingPositive(int[] nums) {

		
		
		for(int i=0;i<nums.length;i++){
			
			if(nums[i]>0 && nums[i]<=nums.length){
				nums[i]=nums[i]*-1;
			}
			
		}
		
		
		System.out.println(Arrays.toString(nums));
		
		return 0;
	}
}
