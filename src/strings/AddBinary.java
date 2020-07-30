package strings;

public class AddBinary {

	public static void main(String[] args) {

		String a = "11";
		String b = "1";

		System.out.println(addBinary(a, b));

	}

	public static String addBinary(String a, String b) {
		String s = a.length() < b.length() ? "a" : "b";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Math.abs(a.length() - b.length()); i++) {
			sb.append("0");
		}
		if (s.equals("b")) {
			b = sb.toString() + b;
		} else {
			a = sb.toString() + a;
		}

		sb = new StringBuilder();

		boolean eb = false;
		for (int i = a.length() - 1; i >= 0; i--) {

			char ch1 = a.charAt(i);
			char ch2 = b.charAt(i);

			if (ch1 == '0' && ch2 == '0') {
				if (eb) {
					sb.append("1");
					eb = false;
				} else {
					sb.append("0");
				}
			} else if (ch1 == '1' && ch2 == '1') {
				if (eb) {
					sb.append("1");
					eb = true;
				} else {
					sb.append("0");
					eb = true;
				}
			} else {
				if (eb) {
					sb.append("0");
					eb = true;
				} else {
					sb.append("1");
				}
			}
		}

		if (eb) {
			sb.append("1");
		}
		return sb.reverse().toString();
	}
}
