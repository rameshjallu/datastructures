package chapter1;

import java.io.*;

import java.util.*;


public class SparseArrays_Solution {

	// Complete the matchingStrings function below.
	static int[] matchingStrings(String[] strings, String[] queries) {

		for (String q : queries) {
			int k=0;
			for (String input : strings) {
				if(q.matches(input)){
					k++;
				}
			}
			System.out.println(k);
		}

		return new int[] {};

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int stringsCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = scanner.nextLine();
			strings[i] = stringsItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = scanner.nextLine();
			queries[i] = queriesItem;
		}

		matchingStrings(strings, queries);
		
		scanner.close();
	}
}
