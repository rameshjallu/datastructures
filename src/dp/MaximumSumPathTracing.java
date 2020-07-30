package dp;

import java.util.Arrays;
import java.util.Random;

public class MaximumSumPathTracing {

	
	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		Random r=new Random();
		
		int[][] nums=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				nums[i][j]=r.nextInt(5)+1;
			}
		}
		
		for(int[] nn:nums){
			System.out.println(Arrays.toString(nn));
		}
		
		//System.out.println(maxSumPath1(nums));
		System.out.println(maxSumPath2(nums));
		//System.out.println(maxSumPath3(nums));
		
	}
	
	
	
	public static int maxSumPath1(int[][] nums){
		int max=0;
		
		max=auxMaxSumPath1(nums.length,nums.length,nums);
		return max;
	}
	
	public static int auxMaxSumPath1(int i,int j,int[][] nums){
		
		if(i==0 || j==0){
			return 0;
		}else if(i==1 && j==1){
			return nums[i-1][j-1];
		}else{
			
			return Math.max(auxMaxSumPath1(i-1, j, nums), auxMaxSumPath1(i, j-1, nums))+nums[i-1][j-1];
		}
	}
	
	
	public static int maxSumPath2(int[][] nums){
		int max=0;
		int[][] mem=new int[nums.length+1][nums.length+1];
		
		max=auxMaxSumPath2(nums.length,nums.length,nums,mem);
		return max;
	}
	
	public static int auxMaxSumPath2(int i,int j,int[][] nums,int[][] mem){
		
		if(i==0 || j==0){
			return 0;
		}else if(i==1 && j==1){
			return nums[i-1][j-1];
		}else{
			
			if(mem[i-1][j-1]!=0){
				return mem[i-1][j-1];
			}
			mem[i-1][j-1]= Math.max(auxMaxSumPath2(i-1, j, nums,mem), auxMaxSumPath2(i, j-1, nums,mem))+nums[i-1][j-1];
			return mem[i-1][j-1];
		}
	}
	
	
	public static int maxSumPath3(int[][] nums){
		int max=0;
		if(nums.length==0) return max;
		int[][] mem=new int[nums.length+1][nums.length+1];
		
		for(int i=0;i<nums.length;i++){
			mem[i][0]=mem[0][i]=0;
		}
		max=auxMaxSumPath3(nums,mem);
		return max;
	}
	
	public static int auxMaxSumPath3(int[][] nums,int[][] mem){
		
		/*for(int[] nn:mem){
			System.out.println(Arrays.toString(nn));
		}*/
		
		for(int i=1;i<=nums.length;i++){
			for(int j=1;j<=nums.length;j++){
					mem[i][j]=Math.max(mem[i-1][j], mem[i][j-1])+nums[i-1][j-1];
				
			}
		}
		return mem[nums.length][nums.length];
	}
	
}
