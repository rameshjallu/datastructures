package strings;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "0P";

		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {

		int fp = 0;
		int sp = s.length() - 1;

		while (fp < sp) {

			while (!Character.isLetterOrDigit(s.charAt(fp))) {
				fp++;
			}
			while (!Character.isLetterOrDigit(s.charAt(sp))) {
				sp--;
			}

			if (fp < sp && fp < s.length() && sp >= 0) {
				if (Character.toLowerCase(s.charAt(fp)) != Character.toLowerCase(s.charAt(sp))) {

					return false;
				}
			}
			fp++;
			sp--;
		}

		return true;
	}
}
