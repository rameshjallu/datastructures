package dp;

public class MaximumSubarray {

	

	public static void main(String[] args) {
		// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int[] nums = { 1 };

		System.out.println(maxSubArray1(nums));
	}

	public static int maxSubArray1(int[] nums) {

		int tmax=Integer.MIN_VALUE;
		
		for (int i = nums.length - 1; i >= 0; i--) {
			tmax=auxMaxSubArray1(nums, i,tmax);
		}

		return tmax;
	}

	public static int auxMaxSubArray1(int[] nums, int n,int tmax) {
		int cmax = nums[n];
		tmax = Math.max(tmax, cmax);
		
		
		for (int i = n-1; i >= 0; i--) {
			cmax = cmax + nums[i];
			tmax = Math.max(tmax, cmax);
		}
		
		return tmax;
	}
	
	
	public static int maxSubArray2(int[] nums) {

		int tmax=Integer.MIN_VALUE;
		
		
			tmax=auxMaxSubArray1(nums, nums.length,tmax);
		

		return tmax;
	}

	public static int auxMaxSubArray2(int[] nums, int n,int tmax) {
		int cmax = nums[n];
		
		if(n==2){
			
		}else{
			
			return Math.max(auxMaxSubArray2(nums,n-1,tmax),Math.max(nums[1], nums[0]+nums[1]));
		}
		
		
		return tmax;
	}
	

}
