package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	// the first nonrepeated character in “total” is 'o' and the first
	// nonrepeated character in “teeter” is 'r'.
	public static void main(String[] args) {

		String s = "122334451";

		System.out.println(getFirstNonRepeatedCharacter(s));
		System.out.println(getFirstNonRepeatedCharacterPos(s));
	}

	public static Character getFirstNonRepeatedCharacter(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, 0);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character ch : s.toCharArray()) {
			int k = map.get(ch);
			if (k == 1) {
				return ch;

			}

		}

		return null;
	}
	
	public static int getFirstNonRepeatedCharacterPos(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, 0);
			} else {
				map.put(ch, 1);
			}
		}

		for (int i=0;i<s.length();i++) {
			int k = map.get(s.charAt(i));
			if (k == 1) {
				return i;

			}

		}

		return -1;
	}
}
