package strings;

import java.util.Arrays;

public class WordSearch {

	public static void main(String[] args) {
		//char[][] board= {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		
		char[][] board= {{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','b'}};
				String word=		"aaaaaaaaaaaaaaaaaaaa";
		//String word="ABCESEEEFSS";
		//String word="ABFDAS";
		System.out.println("main "+exist(board, word));
		
	}

	public static boolean exist(char[][] board, String word) {
		int n = board[0].length;
		int m = board.length;

		/*
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				int[][] trace = new int[m][n];
				if (aux(board, word, trace, i, j)) {
					return true;
				}
			}
		}
		*/
		
		int[][] trace = new int[m][n];
		if (aux(board, word, trace, 0, 0)) {
			return true;
		}
		
		return false;
	}

	public static boolean aux(char[][] board, String word, int[][] trace, int i, int j) {

		System.out.println(word + ":" + i + ":" + j);
		for(int[] t:trace)
		System.out.println(Arrays.toString(t));
		System.out.println();
		if (word.length() == 0)
			return true;
		int n = board[0].length;
		int m = board.length;

		if (i < 0 || i > m - 1)
			return false;
		if (j < 0 || j > n - 1)
			return false;
		
		System.out.println(word +","+ trace[i][j]  +","+ board[i][j] +","+ word.charAt(0));
		if (word.length() != 0 && trace[i][j] != 1 && board[i][j] == word.charAt(0)) {

			trace[i][j] = 1;

			int[][] trace1 = Arrays.stream(trace).map(int[]::clone).toArray(int[][]::new);
			int[][] trace2 = Arrays.stream(trace).map(int[]::clone).toArray(int[][]::new);
			int[][] trace3 = Arrays.stream(trace).map(int[]::clone).toArray(int[][]::new);
			int[][] trace4 = Arrays.stream(trace).map(int[]::clone).toArray(int[][]::new);
			
			
			boolean b1 = aux(board, word.substring(1, word.length()), trace1, i, j + 1);
			boolean b2 = aux(board, word.substring(1, word.length()), trace2, i, j - 1);
			boolean b3 = aux(board, word.substring(1, word.length()), trace3, i - 1, j);
			boolean b4 = aux(board, word.substring(1, word.length()), trace4, i + 1, j);

			if (b1 || b2 || b3 || b4) {
				return true;
			}

		}
		return false;

	}
}
