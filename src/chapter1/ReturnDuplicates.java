package chapter1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReturnDuplicates {

	/*
	 * number rage from 1 to n-1 Output Format
	 * 
	 * Print all the duplicate elements. Output -1 when no repeating elements
	 * are found.
	 */
	static Set<Integer> set = new HashSet<>();
	static Set<Integer> setDrop = new HashSet<>();
	static boolean b = true;

	public static void main(String[] args) {

		int k;

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int input = in.nextInt();
			numbers.add(input);
			printDups(numbers);
		}

		/*
		 * while(in.hasNext()){
		 * 
		 * if(!set.add(k)){ if(setDrop.add(k)){ System.out.println(k); b=false;
		 * }
		 * 
		 * } k = in.nextInt(); }
		 */

		if (b) {
			System.out.println("-1");
		}

	}

	public static void printDups(ArrayList<Integer> numbers) {

		//System.out.println("in printDups " + numbers);

		for (int k : numbers) {
			if (set.add(k)) {
				if (setDrop.add(k)) {
					System.out.println(k);
					
				}
			}

		}

	}

	public static void printDuplicatesHashSet(int k) {

	}

	public static void printDuplicates(int[] ia) {

		int[] dup = new int[ia.length];

		for (int k : ia) {
			dup[k] = 0;
		}

		for (int k : ia) {
			if (dup[k] > 0) {
				System.out.println(k);
			} else {
				dup[k] = k;
			}
		}
	}
}
