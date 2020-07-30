package matrix;

public class MaximumsumofhourglassMatrix {

	public static void main(String[] args) {

		int[][] ia = { { 0 ,3 ,0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 0, 2, 4, 4 }, { 0 ,0 ,0, 2, 4 } };

		System.out.println(maxSum(ia));
	}

	public static int maxSum(int[][] ia) {

		int c = ia[0].length;
		int r = ia.length;

		int max = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("out "+i+":"+j+" r c "+r+" "+c);
				if (i + 2 < r && j + 2 < c) {

					System.out.println("in "+i+":"+j);
					max = Math.max(max, ia[i][j] + ia[i][j + 1] + ia[i][j + 2] + ia[i + 1][j + 1] + ia[i + 2][j]
							+ ia[i + 2][j + 1] + ia[i + 2][j + 2]);
				}
			}
		}

		return max;
	}

}
