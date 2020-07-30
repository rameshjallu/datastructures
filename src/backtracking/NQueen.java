package backtracking;

import java.util.Arrays;

public class NQueen {

	public static void main(String[] args) {
		
		int[] nums=new int[2];
		
		//nqueen1(nums, 1);
		nqueens1(5);
		
	}
	
	private static boolean isValid1(int[] out) {
		// for each pair of queens, check for attacking
		for (int i = 1; i < out.length; ++i) {
			for (int j = 0; j < i; ++j) {
				if (out[j] == out[i]
						|| Math.abs(i - j) == Math.abs(out[i] - out[j]))
					return false;
			}
		}
		return true;
	}
	
	public static void nqueen1(int[] nums,int d){
		if(d==nums.length){
			System.out.println(Arrays.toString(nums));
			
			return;
		}
		
		for(int i=0;i<nums.length;i++){
			
			nums[i]=1;
			
			nqueen1(nums, d+1);
			System.out.println();
			//nums[i]=0;
		}
	}
	
	private static void auxQueens1(int q, int[] out) {
		if (q == out.length) {
			if (isValid1(out))
				System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < out.length; ++i) {
			out[q] = i;
			auxQueens1(q + 1, out);
			System.out.println();
		}
	}

	public static void nqueens1(int n) {
		int[] out = new int[n];
		auxQueens1(0, out);
		
	}
	
}
