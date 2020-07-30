package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
	
	
	public static void main(String[] args) {
		
		System.out.println(new Solution().solveNQueens(9));
		
	}
    public List<List<String>> solveNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] diags = new boolean[2* n + 1];
        boolean[] anti_diags = new boolean[2*n + 1];
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board)
            Arrays.fill(row, '.');
        helper(0, n, board, cols, diags, anti_diags, res);
        return res;
    }
    private void helper(int row, int n, char[][] board, boolean[] cols,
                       boolean[] diags, boolean[] anti_diags, List<List<String>> res)
    {
        if(row == n){
            res.add(getRes(board));
            return;
        }
        for(int j = 0; j < n; j++){
            if(cols[j] || diags[row + j] || anti_diags[n - 1 - row + j]) continue;
            board[row][j] = 'Q';
            cols[j] = diags[row + j] = anti_diags[n - 1 - row + j] = true;
            helper(row+1, n, board, cols, diags, anti_diags, res);
            cols[j] = diags[row + j] = anti_diags[n - 1 - row + j] = false;
            board[row][j] = '.';
        }
        
    }
    private List<String> getRes(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board)
            res.add(new String(row));
        return res;
    }
}