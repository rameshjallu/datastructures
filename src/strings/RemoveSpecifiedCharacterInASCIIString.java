package strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveSpecifiedCharacterInASCIIString {

	public static void main(String[] args) {

		String str = "Battle of the Vowels: Hawaii vs. Grozny";
		String rem = "aeiou";

		// “Bttl f th Vwls: Hw vs. Grzny”.

		// System.out.println(getRemoveSpecifiedCharacter(str, rem));

		System.out.println(getRemoveSpecifiedCharacter(str, rem));
		System.out.println(getRemoveSpecifiedCharacterASCII(str, rem));

	}

	public static String getRemoveSpecifiedCharacter(String str, String rem) {

		Set<Character> set = new HashSet<>();

		for (Character ch : rem.toCharArray()) {
			set.add(ch);
		}

		StringBuilder sb = new StringBuilder();

		for (Character ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				sb.append(ch);
			}

		}

		return sb.toString();
	}

	public static String getRemoveSpecifiedCharacterASCII(String str, String rem) {

		int[] ascii = new int[128];

		for (Character ch : rem.toCharArray()) {
			int i = ch;
			ascii[i] = 1;
		}

		StringBuilder sb = new StringBuilder();

		for (Character ch : str.toCharArray()) {
			int i = ch;
			if (ascii[i] != 1) {
				sb.append(ch);
			}

		}

		return sb.toString();
	}
}
