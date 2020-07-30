package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumAreaofaPieceofCakeAfterHorizontalVerticalCuts {

	public static void main(String[] args) {

		
		int h = 5;
		int w = 4;
		int[] horizontalCuts = {1,2,4 };
		int[] verticalCuts = {  1,3 };
		
		
		/*
		int h = 5;
		int w = 4;
		int[] horizontalCuts = { 3,1 };
		int[] verticalCuts = { 1 };
		*/
		int[][] ans = prepareMatrix(h + 1, w + 1, horizontalCuts, verticalCuts);
		for (int[] ia : ans) {
			System.out.println(Arrays.toString(ia));
		}

		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				
				if(ans[i][j]==2) {
					
					System.out.println(i+":"+j+":"+getArea(i, j, h, w, ans));
				}
			}
		}
	}

	public static int getArea(int i,int j,int h,int w,int[][] ans) {
		
		i=i+1;
		int wid=0;
		for(int c=i;c<h;c++) {
			
			wid++;
			if(ans[i][c]==2) {
				break;
			}
		}
		
		j=j+1;
		int hi=0;
		for(int c=j;c<w;c++) {
			
			hi++;
			if(ans[c][j]==2) {
				break;
			}
		}
		
		
		return hi*wid;
	}
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

		return Integer.MAX_VALUE;
	}

	public static int[][] prepareMatrix(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		int[][] m = new int[h][w];

		Set<String> points = new HashSet<>();

		for (int i : horizontalCuts) {

			for (int j = 0; j < w; j++) {
				points.add(i + ":" + j);
				m[i][j] = 1;
			}
		}

		for (int i : verticalCuts) {

			for (int j = 0; j < h; j++) {
				m[j][i] = 1;
				if (points.contains((j + ":" + i))) {
					m[j][i] = 2;
				}
			}
		}
		return m;
	}
}
