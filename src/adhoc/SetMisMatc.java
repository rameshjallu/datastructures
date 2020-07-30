package adhoc;

public class SetMisMatc {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 4 };

		findErrorNums(nums);

	}

	public static int[] findErrorNums(int[] nums) {

		int ex = nums[0];

		for (int i = 1; i < nums.length; i++) {

			ex = ex ^ nums[i];
		}

		for (int i = 1; i <= nums.length; i++) {
			ex = ex ^ i;
		}

		System.out.println(ex);

		

		return nums;
	}
}
