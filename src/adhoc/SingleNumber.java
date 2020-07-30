package adhoc;

public class SingleNumber {

	public static void main(String[] args) {

		int nums[] ={4,1,2,1,2};
		
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		int ex = 0;

		for (int i = 0; i < nums.length; i++) {
			ex=ex^nums[i];
		}
		return ex;
	}
}
