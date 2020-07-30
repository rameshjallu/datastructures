package chapter1;

import java.util.*;

public class ArrayManipulation_Solution {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {

		int max=0;
		
		int[] array=new int[n+1];
		
		long startTime=System.currentTimeMillis();
		Arrays.fill(array, 0);
		long endTime=System.currentTimeMillis();
		
		System.out.println("Copying zero took ms "+(endTime-startTime));
		
		//System.out.println(Arrays.toString(array));
		for(int[] ia: queries){
			
			
			
			int i=ia[0];
			int j=ia[1];
			int k=ia[2];
			
			//System.out.println("i j k "+i+"-"+j+"-"+k);
			for(int index=i;index<=j;index++){
				array[index]=(array[index])+k;
				if(max<array[index]){
					max=array[index];
				}
			}
			
			//System.out.println(Arrays.toString(array));
			
		}
		
		
		
		return max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long startTime=System.currentTimeMillis();
		long result = arrayManipulation(n, queries);
		long endTime=System.currentTimeMillis();
		System.out.println(result+" took ms"+(endTime-startTime));
		
		scanner.close();
	}
}
