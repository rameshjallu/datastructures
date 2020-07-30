package backtracking;

import java.util.Arrays;

public class SudokuSolver {

	public static void main(String[] args) {
		int[][] in = { { 2, 7, 0, 0, 8, 0, 0, 5, 0 },
				{ 0, 0, 0, 3, 0, 2, 0, 0, 6 }, { 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 8, 0, 0, 9, 0, 0, 0, 7 }, { 4, 0, 0, 0, 0, 0, 0, 8, 0 },
				{ 7, 0, 3, 0, 0, 0, 6, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 0, 2 },
				{ 0, 0, 0, 0, 0, 5, 0, 0, 0 }, { 0, 0, 9, 6, 0, 8, 4, 1, 0 } };
		sudokuSolver2(in);
	}
	
	public static void sudokuSolver2(int[][] in){
		
		for(int[] nums:in){
			System.out.println(Arrays.toString(nums));
		}
	}
	
	
	public static void print(int[] nums,int d){
		
		for(int i=0;i<nums.length;i++){
			
			//nums[i]
		}
	}
}
