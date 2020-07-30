package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int[] result=null;
	

	
	public static void main(String[] args) {

		//int[] nums={10,9,2,5,3,7,101,18};

		int[] nums = {1,2,3,0,1,2};

		System.out.println(lengthOfLIS1(nums));
		

	}
	
	public static int lengthOfLIS1(int[] nums){
		
		int max=0;
		
		
		for(int i=nums.length;i>=1;i--){
			max=Math.max(max,auxLengthOfLIS1(i,nums));
		}
		return max;
	}
	
	
	public static int auxLengthOfLIS1(int n,int[] nums){
		
		if(n==1) return 1;
		int cmax=1;
		for(int j=1;j<n;j++){
			
			if(nums[j-1]<nums[n-1]){
				cmax=  Math.max(auxLengthOfLIS1(j, nums)+1,cmax);
				System.out.println("cmax "+cmax);
			}
		}
		
		
		return cmax;
	}
	
	
	public static int insertLenthArray(int ele1){
		
		for(int i=0;i<result.length;i++){
			
			if(result[i]>=ele1 || result[i]==Integer.MIN_VALUE){
				result[i]=ele1;
				//System.out.println(Arrays.toString(result));
				//System.out.println("ans "+(i+1));
				return i+1;
			}
		}
		return 1;
		
	}

	public static int lengthOfLIS(int[] nums) {
		int lis = 0;
		
		result=new int[nums.length];
		
		for(int i=0;i<result.length;i++){
			result[i]=Integer.MIN_VALUE;
		}

		if (nums.length == 0)
			return 0;

		for (int i = 0; i < nums.length; i++) {
			insertLenthArray(nums[i]);
		}
		//System.out.println(Arrays.toString(nums));
		
		for( lis=0;lis<result.length;lis++){
			if(result[lis]==Integer.MIN_VALUE){
				break;
			}
		}
		return lis;

	}

}
