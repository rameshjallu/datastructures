package adhoc;

public class Combinations {

	
	public static void main(String[] args) {
		
		int[] nums={1,2,3};
		
		combination(nums.length, nums);
		
		
	}
	
	public static void combination(int n,int[] nums){
		
		if(n==1) {
			System.out.print(nums[0]+" ");
			return;
		}
		
		combination(n-1, nums);
		System.out.print(nums[n-1]+" ");
		System.out.println();
		System.out.println("==============");
		System.out.print(nums[n-1]+" ");
		combination(n-1, nums);
		System.out.println();
	}
}
