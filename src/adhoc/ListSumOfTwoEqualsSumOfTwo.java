package adhoc;

import java.util.HashMap;
import java.util.Map;

public class ListSumOfTwoEqualsSumOfTwo {

	public static void main(String[] args) {
		

		int[] nums={1,2,3,4,5,6};
		
		printPairs(nums);
		
	}
	
	public static void printPairs(int[] nums){
		
		Map<Integer, String> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++){
			
			for(int j=i+1;j<nums.length;j++){
				
				if(map.containsKey(nums[i]+nums[j])){
					String value=map.get(nums[i]+nums[j]);
					
					System.out.println(value+" && "+(nums[i]+":"+nums[j]));
				}else{
					map.put(nums[i]+nums[j], nums[i]+":"+nums[j]);
				}
			}
		}
		
		//System.out.println(map);	
		}
	
	

}
