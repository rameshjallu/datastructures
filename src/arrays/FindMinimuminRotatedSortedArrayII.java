package arrays;

public class FindMinimuminRotatedSortedArrayII {

	int ans=0;
	public static void main(String[] args) {
		
	}
	
	 public int findMin(int[] nums) {
	        
		 
		 return ans;
	    }
	 
	 public void aux(int[] nums,int i,int j) {
		 int mid=(i+j)/2;
		 if(nums[i]<nums[j]) {
			 
		 }else {
			 int last=nums[j];
			 if(nums[i]<last) {
				 ans=nums[0];
			 }else {
				 aux(nums,mid+1,j);
			 }
		 }
	 }
}
