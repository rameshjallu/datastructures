package completesearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class StringPermutations {

	public static void main(String[] args) {

		permutations("123", "", null);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<>();

		for (int i = 1; i <= n; i++) {
			sb.append("()");
		}
		permutations("abc", "", set);

		// System.out.println("set "+set);

		/*
		 * for(String s:set){ list.add(s);
		 * 
		 * }
		 */

		return list;

	}

	public static void permutations(String in, String out, Set<String> set) {

		if (in.length() == 0) {
			System.out.println(out);
			return;
		}
		for (int i = 0; i < in.length(); i++, set = new HashSet<>()) {

			permutations(in.substring(0, i) + in.substring(i + 1, in.length()), out + "" + in.charAt(i), set);
		}

	}

	public static boolean isValid(String out) {

		boolean b = true;

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < out.length(); i++) {
			Character ch = out.charAt(i);
			if (ch.equals('(')) {
				stack.push("(");
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				String s = stack.pop();
				if (!s.equals("(")) {
					return false;
				}
			}
		}

		if (!stack.isEmpty()) {
			return false;
		}
		return b;

	}
}
