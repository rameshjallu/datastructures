package dp;

import java.util.Arrays;
import java.util.Random;

public class WaysinMatrix {

	
	public static void main(String[] args) {
		

		
		int n=3;//Integer.parseInt(args[0]);
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
		System.out.println(new WaysinMatrix().maxSumPath2(nums));
		
	
		
		
	}

	public int uniquePaths(int m, int n) {
    
		return 0;
    }

	public int maxSumPath2(int[][] nums){
		int max=0;
		int[][] mem=new int[nums.length+1][nums.length+1];
		
		MyInteger myInteger=new MyInteger(0);
		
		max=auxMaxSumPath2(nums.length,nums.length,nums,mem,myInteger);
		
		System.out.println("ways "+myInteger.i);
		return max;
	}
	
	public static int auxMaxSumPath2(int i,int j,int[][] nums,int[][] mem,MyInteger myInteger){
		
		if(i==0 || j==0){
			return 0;
		}else if(i==1 && j==1){
			myInteger.i=myInteger.i+1;
			return nums[i-1][j-1];
		}else{
			
			if(mem[i-1][j-1]!=0){
				return mem[i-1][j-1];
			}
			auxMaxSumPath2(i-1, j, nums,mem,myInteger);
			auxMaxSumPath2(i, j-1, nums,mem,myInteger);
			//return mem[i-1][j-1];
			return 0;
		}
	}
	
	class MyInteger{
		
		public MyInteger(int i){
			this.i=i;
		}
		int i;
		
	}
	
}
