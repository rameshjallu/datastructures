package chapter1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;


public class SockMerchant_Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

    	
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i:ar){
    		
    		if(map.containsKey(i)){
    			int v=map.get(i);
    			map.put(i, ++v);
    		}else{
    			map.put(i, 1);
    		}
    	}
    	
    	System.out.println(map);
    	
    	Set<Map.Entry<Integer, Integer>> set= map.entrySet();
    	
    	for(Entry<Integer, Integer> e:set){
    		
    		if(e.getValue()>2){
    			pair=pair+(e.getValue())%2;	
    			//System.out.println(e.getValue());
    		}
    		
    		
    	}
    	return pair;

    }

    private static final Scanner scanner = new Scanner(System.in);

    private static int pair=0;
    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

       System.out.println(result);

        scanner.close();
    }
}
