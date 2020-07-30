package strings;

public class ShuffleString {

	public static void main(String[] args) {
		String s = "art";
		int[] indices = {1,0,2};

		System.out.println(restoreString(s, indices));
	}

	public static String restoreString(String s, int[] indices) {

		char[] ca = new char[s.length()];

		for (int i = 0; i < indices.length; i++) {
			char ch = s.charAt(i);
			ca[indices[i]] = ch;
		}

		return new String(ca);
	}
}
