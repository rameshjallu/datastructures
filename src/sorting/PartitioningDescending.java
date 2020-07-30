package sorting;

import java.util.Arrays;

public class PartitioningDescending {

	public static void main(String[] args) {
		
		int[] nums={3,2,3,1,2,4,5,5,6};
		quicksort(nums, 0, nums.length);
		
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void quicksort(int[] nums,int l,int r){
		
		if(l>=r) return ;
		
		int p=pivotPosition(nums, l, r);
		
		quicksort(nums, l, p);
		quicksort(nums, p+1, r);
		
	}
	
	public static int pivotPosition(int[] nums,int l,int r){
		int minPos=l;
		int maxPos=-1;
		int pivot=l;
		
		for(int i=l+1;i<r;i++){
			
			if(nums[pivot]<nums[i]){
				minPos=i;
				if(maxPos!=-1){
					swap(nums, minPos, maxPos);
					minPos=maxPos;
					maxPos++;
				}
				
			}else{
				if(maxPos==-1){
					maxPos=i;
				}
			}
		}
		if(pivot!=minPos){
		swap(nums, pivot, minPos);
		}
		return minPos;
	}
	
	public static void swap(int[] nums,int pos1,int pos2){
		
		int c=nums[pos1];
		
		nums[pos1]=nums[pos2];
		nums[pos2]=c;
	}
}
