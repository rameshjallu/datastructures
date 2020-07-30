package adhoc;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) {

		int [] nums={1,1};
		
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			int c=Math.abs(nums[i]);
			
			if(nums[c-1]>0){
				nums[c-1]=nums[c-1]*-1;
				
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0){
				list.add(i+1);
			}
		}
		return list;
	}

}
