package dp;

import java.util.Arrays;

public class MaximumSubSetSum {

	
	
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

	
		//int[] nums={1,1,1,1,1,1,1};
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		int totalSum=Integer.MIN_VALUE;
		int sum;
		int n=combinationsCount(nums.length);
		
		System.out.println("count "+n);
		for(int i=1;i<=n;i++){
			int[] ia=bits(i,nums.length);
			
			//System.out.println(Arrays.toString(nums));
			//System.out.println(Arrays.toString(ia));
			sum=0;
			for(int k=0;k<ia.length;k++){
				if(ia[k]!=0){
					
					System.out.print(nums[k]+" ");
					sum+=nums[k];
				}
			}
			System.out.println();
			
			if(totalSum<sum){
				System.out.println("sum "+sum);
				totalSum=sum;
			}
		}
		return totalSum;
	}
	
	public static int[] bits(int n,int length){
		int temp=n;
		int[] ia=new int[length];
		for(int i=0;i<length;i++){
			ia[i]=temp%2;
			temp=temp/2;
		}
		return ia;
	}
	public static int combinationsCount(int n){
		int sum=0;
		
		for(int i=1;i<=n;i++){
			sum+=nCr(n,i);
		}
		return sum;
	}

	public static int nCr(int n, int r) 
	{ 
	    return fact(n) / (fact(r) * 
	                  fact(n - r)); 
	} 
	  
	// Returns factorial of n 
	public static int fact(int n) 
	{ 
	    int res = 1; 
	    for (int i = 2; i <= n; i++) 
	        res = res * i; 
	    return res; 
	}
	
	

	
}
