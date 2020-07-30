package dp;



public class LongestCommonSubSequenceIntegers {

	public static void main(String[] args) {

		String word1 = "dinitrophenylhydrazine";
		String word2 = "acetylphenylhydrazine";

		
		long start=System.currentTimeMillis();
		
		System.out.println(minDistance(word1, word2));
		
		long end=System.currentTimeMillis();
		
		System.out.println("took "+(end-start)/1000.0);

	}

	public static int minDistance(String word1, String word2) {

		int res = 0;

		int min = auxMinDistance(word1, word2);
		res = (word1.length() - min) + (word2.length() - min);

		return res;
	}

	public static int auxMinDistance(String word1, String word2) {

		int res = 0;

		int[][] mem=new int[word1.length()][word2.length()];
		
		res = auxLongestCommonSubsequence(0, 0, word1, word2,mem);

		return res;

	}

	static int auxLongestCommonSubsequence(int i, int j, String a, String b,int[][] mem) {

		if (i == a.length() || j == b.length()) {
			return 0;
		}
		
		if(mem[i][j]!=0){
			return mem[i][j];
		}
		if (a.charAt(i) == b.charAt(j)) {

			return 1 + auxLongestCommonSubsequence(i + 1, j + 1, a, b,mem);
		} else {

			return mem[i][j] =Math.max(auxLongestCommonSubsequence(i, j + 1, a, b,mem), auxLongestCommonSubsequence(i + 1, j, a, b,mem));
		}

	}

}
