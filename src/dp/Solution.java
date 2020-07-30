package dp;

public class Solution {
	  
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
		
		for(int i=0;i<m;i++){
			mem[i][0]=0;
		}
		
		for(int i=0;i<n;i++){
			mem[0][i]=0;
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
					int min=0;
					
					if(mem[i-1][j]==0 || mem[i][j-1]==0){
						min=Math.max(mem[i-1][j], mem[i][j-1]);
					}else{
						min=Math.min(mem[i-1][j], mem[i][j-1]);
					}
					mem[i][j]=min+grid[i-1][j-1];
				
			}
		}
/*		for(int[] nn:mem){
			System.out.println(Arrays.toString(nn));
		}
*/		return  mem[m][n];
	}
	
	public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
	
}
