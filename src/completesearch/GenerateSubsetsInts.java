package completesearch;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsetsInts {

	public static void main(String[] args) {


		int[] nums={1,2,3};
		
		subsets(nums);
	}
	
	public static void subsets(int[] nums){
		
		List<List<Integer>> subsets = new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		
		
		auxSubsets(nums,0,list,subsets);
		
	}


	public static void auxSubsets(int[] nums,int d,List<Integer> list,List<List<Integer>> subsets ){
		System.out.println(list);
		if(nums.length==d) {
			return;
		}else{
			for(int i=d;i<nums.length;i++){
				
				List<Integer> list1=new ArrayList<>();
				list1.add(nums[i]);
				list1.addAll(list);
				
				auxSubsets(nums,d+1, list1,subsets);
			}
		}
	}

}
