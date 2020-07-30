package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GenerateSubsets2 {

	public static void main(String[] args) {

		//int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};

		//int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};

		Integer[] nums={1,2,3};
		long l=System.currentTimeMillis();
		
		System.out.println(subsets(nums));
		
		long l1=System.currentTimeMillis();
		
		//System.out.println("took ms "+(l1-l));
	}


	public static List<List<Integer>> subsets(Integer[] nums) {

		List<Integer> list = new ArrayList<>();

		List<List<Integer>> subsets = new ArrayList<>();

		auxSubsets(nums, nums.length, list, subsets);

		return subsets;

	}

	public static void auxSubsets(Integer[] nums, int n, List<Integer> list, List<List<Integer>> subsets) {

		if (nums.length == 0)
			return;
		// System.out.println("n & list "+n+" "+list);
		if (n == 0) {
			// System.out.println(list);
			subsets.add(list);

		} else {

			auxSubsets(nums, n - 1, list, subsets);

			List<Integer> list2 = new ArrayList<>();
			list2.add(nums[n - 1]);

			list2.addAll(list);

			auxSubsets(nums, n - 1, list2, subsets);

		}

	}
}
