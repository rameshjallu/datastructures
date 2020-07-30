package strings;

public class ReverseWords {

	public static void main(String[] args) {

		// "Do or do not, there is no try."
		// to "try. no is there not, do or Do"

		//String str = "Do or do not, there is no try.";
		String str = "abcdef   gh i            j";

		String revLine = revLine(str);

		System.out.println(revLine);

		char[] ca = revLine.toCharArray();
		int fp = 0;
		int sp = 0;

		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == ' ') {
				sp = i-1;
				ca=rev(ca, fp, sp);
			} else {
				if (fp != Integer.MAX_VALUE) {
					fp = i;
				}
			}
		}

		String s = "abcd ef g";

		System.out.println(rev(s.toCharArray(), 0, 3));

	}

	public static char[] rev(char[] ca, int fp, int sp) {

		while(fp<sp) {
			char temp = ca[fp];
			ca[fp] = ca[sp];
			ca[sp] = temp;
			fp++;
			sp--;
		}
		

		return ca;
	}

	public static char[][] revWords(String str) {

		return null;
	}

	public static String revLine(String str) {

		char[] ca = str.toCharArray();

		for (int i = 0; i < ca.length / 2; i++) {
			char temp=ca[i];
			ca[i] = ca[ca.length - 1 - i];
			ca[ca.length - 1 - i]=temp;
		}

		return new String(ca);
	}
}
