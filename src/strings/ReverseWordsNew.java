package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsNew {

	public static void main(String[] args) {

		String str = "a good   example";

		System.out.println(reverseWords(str));

	}

	public static String reverseWords(String s) {

		char ca[] = s.toCharArray();
		List<String> list = new ArrayList<>();

		int fp = 0;
		int i = 0;
		for (i = 0; i < ca.length; i++) {

			char ch = ca[i];
			if (ch == ' ') {

				list.add(s.substring(fp, i));
				fp = i;
				while (i < ca.length && ca[i] == ' ') {
					i++;
				}
				list.add(s.substring(fp, i));
				fp = i;
			}

		}
		if (i <= ca.length) {
			list.add(s.substring(fp, i));
		}

		StringBuilder sb = new StringBuilder();

		for (String str : list) {
			str=str.trim();
			sb.append(str.length()==0?" ":new StringBuilder(str).reverse());
		}

		return sb.reverse().toString().trim();
	}
}
