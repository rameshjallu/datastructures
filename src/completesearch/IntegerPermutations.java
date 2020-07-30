package completesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntegerPermutations {

	public static void main(String[] args) {

		int[] in = { 1 };

		System.out.println(permute(in));

	}

	public static List<List<Integer>> permute(int[] nums) {

		List<Integer> list = new ArrayList<>();

		List<List<Integer>> finalList = new ArrayList<>();

		permutations(nums, list, finalList);
		return finalList;
	}

	public static void permutations(int[] in, List<Integer> list, List<List<Integer>> finalList) {

		if (in.length == 0) {
			// System.out.println(list);
			finalList.add(list);
			return;
		}
		for (int i = 0; i < in.length; i++) {

			int[] nums1 = Arrays.copyOfRange(in, 0, i);
			int[] nums2 = Arrays.copyOfRange(in, i + 1, in.length);

			int[] result = new int[in.length - 1];

			System.arraycopy(nums1, 0, result, 0, nums1.length);
			System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

			List<Integer> new_list = new ArrayList<>();

			new_list.add(in[i]);
			new_list.addAll(list);

			permutations(result, new_list, finalList);
		}

	}
}
