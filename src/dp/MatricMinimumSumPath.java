package dp;

import java.util.Arrays;
import java.util.Random;




public class MatricMinimumSumPath {

	
	public static void main(String[] args) {
		
		//String input="[[0,2,2,6,4,1,6,2,9,9,5,8,4,4],[0,3,6,4,5,5,9,7,8,3,9,9,5,4],[6,9,0,7,2,2,5,6,3,1,0,4,2,5],[3,8,2,3,2,8,8,7,5,9,6,3,4,5],[4,0,1,3,9,2,0,1,6,7,9,2,8,9],[6,2,7,9,0,9,5,2,7,5,1,4,4,7],[9,8,3,3,0,6,8,0,8,8,3,5,7,3],[7,7,4,5,9,1,5,0,2,2,2,1,7,4],[5,1,3,4,1,6,0,4,3,8,4,3,9,9],[0,6,4,9,4,1,5,5,4,2,5,7,4,0],[0,1,6,6,4,9,2,7,8,2,1,3,3,7],[8,4,9,9,2,3,8,6,6,5,4,1,7,9]]";
		
		String input="[[1,3,1],[1,5,1],[4,2,1]]";
		
		//String input="[[0,3,1],[0,5,1],[0,2,0]]";
				
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
		System.out.println();
		
		System.out.println(minPathSum(nums));
		
	}
	
	
	public static int minPathSum(int[][] grid) {
		int max=0;
		if(grid.length==0) return max;
		
		max=auxMinSumPath3(grid);
		return max;
    }
	
	public static int auxMinSumPath3(int[][] grid){
		
		int m=grid.length;
		int n=grid[0].length;
		
		
		int[][] mem=new int[m+1][n+1];
		
		for(int i=0;i<m+1;i++){
			mem[i][0]=-1;
		}
		
		for(int i=0;i<n+1;i++){
			mem[0][i]=-1;
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
					int min=0;
					
					if(mem[i-1][j]==-1 && mem[i][j-1]==-1){
						min=0;
					}else if(mem[i-1][j]==-1){
						min=mem[i][j-1];
					}else if(mem[i][j-1]==-1){
						min=mem[i-1][j];
					}else{
						min=Math.min(mem[i-1][j], mem[i][j-1]);
					}
					mem[i][j]=min+grid[i-1][j-1];
				
			}
		}
		/*for(int[] nn:mem){
			System.out.println(Arrays.toString(nn));
		}*/
		return  mem[m][n];
	}
	
}
