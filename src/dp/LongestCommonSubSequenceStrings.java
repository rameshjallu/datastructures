package dp;

import java.util.Arrays;

public class LongestCommonSubSequenceStrings {

	
	public static void main(String[] args) {
		
		/*int[] a={3, 9, 8, 3, 9, 7 ,9 ,7, 0};
		int[] b={3, 3, 9, 9, 9 ,1 ,7 ,2 ,0, 6};
		*/
		
		int[] a={3, 9, 8, 3, 9, 7 ,9 ,7, 0};
		int[] b={3, 3, 9, 6,0,1};
		
		
		System.out.println(longestCommonSubsequence(a, b));
		
	}
	// Complete the longestCommonSubsequence function below.
    static int longestCommonSubsequence(int[] a, int[] b) {

    	int res=0;
    	int[] op=new int[Math.max(a.length, b.length)];
    	res=auxLongestCommonSubsequence(0, 0, a, b,op);
    	
    	int dest[]=new int[res];
    	
    	
    	System.arraycopy(op, 0, dest, 0, res);
    	
    	System.out.println(Arrays.toString(dest));
    	
    	
    	return  res;

    }
    
    static int auxLongestCommonSubsequence(int i,int j,int[] a, int[] b,int[] op) {
    	
    	if(i==a.length||j==b.length){
    		return 0;
    	}
    	if(a[i]==b[j]){
    		
    		System.out.println(a[i]);
    		op[i]=a[i];
    		return 1+auxLongestCommonSubsequence(i+1, j+1, a, b,op);
    	}else{
    		
    		return Math.max(auxLongestCommonSubsequence(i, j+1, a, b,op), auxLongestCommonSubsequence(i+1, j, a, b,op));
    	}

    }

    
}
