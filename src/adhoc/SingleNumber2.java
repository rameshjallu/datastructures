package adhoc;

public class SingleNumber2 {

	public static void main(String[] args) {

		//int[] nums = { 2, 2, 1, 2, 4, 1, 1,4,-9,4 };
		int[] nums = { 1,1,1,5};
		System.out.println(singleNumber1(nums));
	}

	public static int singleNumber1(int[] nums) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int sum = 0;
			for (int j = 0; j < nums.length; j++) {
				if (((nums[j] >> i) & 1) == 1) {
					sum++;
					sum %= 3;
				}
			}
			if (sum == 1) {
			    ans |= sum << i;
			}
		}
		return ans;
	}

}
