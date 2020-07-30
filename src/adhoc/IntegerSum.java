package adhoc;

import java.util.Arrays;

public class IntegerSum {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3 };
		/*nums = findErrorNums(nums);

		System.out.println(Arrays.toString(nums));*/
		nums = findErrorNums1(nums);
		//System.out.println(Arrays.toString(nums));
	}

	public static int[] findErrorNums(int[] nums) {
		int sum = 0;
		int sqsum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] - (i + 1);
			sqsum += nums[i] * nums[i] - (i + 1) * (i + 1);
		}
		int n = nums.length;
		int diff = sum;
		sum = sqsum / sum;
		int a[] = new int[2];
		a[0] = (sum + diff) / 2;
		a[1] = (sum - a[0]);
		return a;
	}

	public static int[] findErrorNums1(int[] nums) {
		int[] res = new int[2];
		for (int i : nums) {
			if (nums[Math.abs(i) - 1] < 0) {
				res[0] = Math.abs(i);
			} else {
				nums[Math.abs(i) - 1] *= -1;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				res[1] = i + 1;
			}
		}
		System.out.println(Arrays.toString(nums));
		
		return res;
	}
}
