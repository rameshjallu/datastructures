package dp;

import java.util.Arrays;

public class AlternateSum {

	public static int mem[];
	
	public static void main(String[] args) {

		
		
		 int nums[] ={1,2,-3,1,9,10};

		System.out.println(rob(nums));
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(Arrays.toString(mem));
		
		path(mem.length-1, nums, mem);
		
		
	}

	public static void path(int i,int[] nums,int[] mem){
		
		if(i<=1) {
			
			//System.out.println("path "+nums[i]);
			
			return;
		}
		
		//System.out.println(mem[i]+" | ");
		if(mem[i]==mem[i-1]){
			path(i-1, nums, mem);
		}else{
			
			path(i-2, nums, mem);
			System.out.println("path "+nums[i-1]);
		}
		
	}
	public static int rob(int[] nums) {

		mem =new int[nums.length+1];
	
		for(int i=0;i<nums.length+1;i++){
			mem[i]=-1;
		}
		
		
		
		return auxRob(nums.length, nums);
	}

	private static int auxRob(int n, int[] nums) {

		if (n <= 0)
			return 0;
		if (n == 1) {
			return nums[0];
		} else {

			if(mem[n]!=-1){
				return mem[n];
			}else{
				int inclMax = auxRob(n - 2, nums) + nums[n - 1];
				int exclMax = auxRob(n - 1, nums);
				mem[n]=Math.max(inclMax, exclMax);
				return mem[n];
			}
			
		}

	}
	
	public static int rob1(int[] nums) {

		mem =new int[nums.length+1];
	
		for(int i=0;i<nums.length+1;i++){
			mem[i]=-1;
		}
		return auxRob(nums.length, nums);
	}

	private static int auxRob1(int n, int[] nums) {

		if (n <= 0)
			return 0;
		if (n == 1) {
			return nums[0];
		} else {

			if(mem[n]!=-1){
				return mem[n];
			}else{
				int inclMax = auxRob(n - 2, nums) + nums[n - 1];
				int exclMax = auxRob(n - 1, nums);
				mem[n]=Math.max(inclMax, exclMax);
				return mem[n];
			}
			
		}

	}
}
