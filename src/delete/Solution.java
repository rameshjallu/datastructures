package delete;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the longestCommonSubsequence function below.
    static int[] longestCommonSubsequence(int[] a, int[] b) {

    	int res=0;
    	int[] op=new int[Math.max(a.length, b.length)];
    	res=auxLongestCommonSubsequence(0, 0, a, b,op);
    	
    	int dest[]=new int[res];
    	System.arraycopy(op, 0, dest, 0, res);
   	return  dest;

    }
    
    static int auxLongestCommonSubsequence(int i,int j,int[] a, int[] b,int[] op) {
    	
    	if(i==a.length||j==b.length){
    		return 0;
    	}
    	if(a[i]==b[j]){
    		op[i]=a[i];
    		return 1+auxLongestCommonSubsequence(i+1, j+1, a, b,op);
    	}else{
    		
    		return Math.max(auxLongestCommonSubsequence(i, j+1, a, b,op), auxLongestCommonSubsequence(i+1, j, a, b,op));
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = longestCommonSubsequence(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
