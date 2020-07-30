package sorting;

import java.util.Arrays;
import java.util.Random;

public class KthLargestElementinArray_Leet {

	public static void main(String[] args) {

		//int[] nums={3,2,1,5,6,4};
		
		int[] nums={7, 10, 4, 3, 20, 15};
		
		int k=3;
		
		//System.out.println(pivotPosition(nums, 0, nums.length)+" "+Arrays.toString(nums));
		
		System.out.println(new KthLargestElementinArray_Leet().findKthLargest(nums, k));
		
		/*
		for(int i=0;i<nums.length;i++){
			
			System.out.println("i "+i+" ans: "+new KthLargestElementinArray_Leet().findKthLargest(nums, i));
		}
		*/
	}

	Random rand = new Random();
    //public void swap(int[]nums, int i, int j){
    //int temp = nums[i];
    //    nums[i] = nums[j];
    //    nums[j] = temp;
    //}
   
    public int quicksort(int[] nums, int start, int end, int k){
        if (start > end) return Integer.MAX_VALUE;        
        int random = start + rand.nextInt(end-start+1);
        int temp = nums[random];
        nums[random] = nums[end];
        nums[end] = temp;
         // swap(nums, end, random);
        int pivot = nums[end];        
        int left = start;
        for(int j = start; j < end; j++){
            if(nums[j] <= pivot){
                temp = nums[j];
                nums[j] = nums[left];
                nums[left++] = temp;
                //swap(nums, left++, j);
            }
        }
        temp = nums[left];
        nums[left] = nums[end];
        nums[end] = temp;
        //swap(nums, left, end);       
        if(left == k){
            return nums[left];
        }else if(left < k){
            return quicksort(nums, left+1, end, k);                 
        }else{
            return quicksort(nums, start, left-1, k);   
        }
    }
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return Integer.MAX_VALUE;
        return  quicksort(nums, 0, nums.length-1,nums.length-k);
    }
}
