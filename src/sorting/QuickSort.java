package sorting;

import java.util.Arrays;

public class QuickSort {

	
	public static void main(String[] args) {
		
		int[] nums={4,1,3,5,2};
		
		System.out.println(Arrays.toString(nums));
		
		quick(0, nums.length, nums);
		
	}
	
	public static void quick(int l,int r,int[] nums){
		
		int p=nums[getPivotPosition(l, nums)];
		
		int b=l+1;
		
		for(;l<r;l++){
			
			if(p>nums[l]){
				swap(b++,l,nums);
			}
		}
		
		swap(b, l, nums);
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static void swap(int pos1,int pos2,int[] nums){
		int c=nums[pos1];
		
		nums[pos1]=nums[pos2];
		nums[pos2]=c;
	}
	
	public static int getPivotPosition(int l,int[] nums){
		
		return l;
	}
}
