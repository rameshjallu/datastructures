package sorting;

import java.util.Arrays;

public class KthLargestElementinArray {

	public static void main(String[] args) {

		//int[] nums={3,2,1,5,6,4};
		
		int[] nums={3,2,1,5,6,4};
		
		int k=2;
		
		//System.out.println(pivotPosition(nums, 0, nums.length)+" "+Arrays.toString(nums));
		
		System.out.println(findKthLargest(nums, k));
		
		
		/*for(int i=0;i<nums.length;i++){
			
			System.out.println("i "+i+" ans: "+findKthLargest(nums, i));
		}*/
		
	}

	public static int findKthLargest(int[] nums, int k) {

		return auxFindKthLargest(nums, k-1, 0, nums.length);
	}
	
	public static int auxFindKthLargest(int[] nums, int k,int l,int r) {

		//System.out.println("before "+Arrays.toString(nums));
		
		int p=pivotPosition(nums, l, r);
		
		//System.out.println("after "+Arrays.toString(nums));
		
		//System.out.println("p "+p+" k "+k+" l "+l+" r "+r);
		if(k>p){
			return auxFindKthLargest(nums, k,p+1, r);
		}else if(k<p){
			return auxFindKthLargest(nums,k, l, p);
		}else{
			return nums[p];
		}

	}

	public static int pivotPosition(int[] nums, int l, int r) {
		int minPos = l;
		int maxPos = -1;
		int pivot = l;

		for (int i = l + 1; i < r; i++) {

			if (nums[pivot] <nums[i]) {
				minPos = i;
				if (maxPos != -1) {
					swap(nums, minPos, maxPos);
					minPos = maxPos;
					maxPos++;
				}

			} else {
				if (maxPos == -1) {
					maxPos = i;
				}
			}
		}
		if (pivot != minPos) {
			swap(nums, pivot, minPos);
		}
		return minPos;
	}

	public static void swap(int[] nums, int pos1, int pos2) {

		int c = nums[pos1];

		nums[pos1] = nums[pos2];
		nums[pos2] = c;
	}
}
