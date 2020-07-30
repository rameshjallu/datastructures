package adhoc;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		/*int[] nums1={0,0,1,1,1,2,2,3,3,4,4,4,4,4,4,4,5};
		
		removeDuplicates(nums1);
		
		int[] nums2={0,0,0,0,0,0};
		
		removeDuplicates(nums2);
		
		int[] nums3={};
		removeDuplicates(nums3);
		int[] nums4={0};
		removeDuplicates(nums4);*/
		
		int[] nums5={1,2,2,2,2,2,7,7,7,9,999};
		removeDuplicates(nums5);
	}
	
	public static int removeDuplicates(int[] nums) {
        
		
		
		
		if(nums.length==0) return 0;
		if(nums.length==1) return 1;
        int c=0;
        int d=nums[0];
		
        for(int i=1;i<nums.length;i++){
        	
        	if(d!=nums[i]){
				c++;
				
			}else{
				nums[c]=d;
				d=nums[i];
			}
			
			
        }
		
		
		//System.out.println(c+1);
        
        System.out.println(c+1);
        
        for(int i=0;i<c+1;i++){
        	
        	System.err.print(nums[i]+" ");
        }
		//System.out.println(Arrays.toString(nums));
		//System.out.println("-----------------");
        return c+1;
    }
}
