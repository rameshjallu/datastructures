package strings;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int i=-1000000000;
		System.out.println(reverse(i));
		System.out.println(reverseNew(i));
	}

	public static int reverseNew(int x) {
		
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
		try {
		    return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
		} catch (NumberFormatException e) {
		    return 0;
		}
		
	}
	public static int reverse(int x) {

		if (x == 0)
			return 0;

		String s = x + "";
		boolean isNegative = false;
		if (s.charAt(0) == '-') {
			s = s.substring(1);
			isNegative = true;
		}

		String rev = rev(s);

		int fp = 0;
		int c = 0;
		while (rev.charAt(fp) == '0') {
			c++;
			fp++;
		}

		long ans = Long.parseLong(rev.substring(c));
		if(ans>Integer.MAX_VALUE) return 0;
		if (isNegative) {
			ans = ans * -1;
		}

		return (int) ans;

	}

	public static String rev(String s) {

		char[] ca = s.toCharArray();

		for (int i = 0; i < ca.length / 2; i++) {
			char temp = ca[i];
			ca[i] = ca[ca.length - 1 - i];
			ca[ca.length - 1 - i] = temp;

		}

		return new String(ca);
	}
}
