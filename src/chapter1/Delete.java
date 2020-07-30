package chapter1;

public class Delete {

	public static void main(String[] args) {

		String in = "123";

		subsets(in);

	}

	public static void subsets(String in) {

		auxSubsets(in, "");
	}

	public static void auxSubsets(String in, String out) {

		System.out.println(out);
		if (in.length() == 0) {
			return;
		}

		for (int i = 0; i < in.length(); i++) {
			auxSubsets(in.substring(i + 1), out+""+in.charAt(i) );
		}

	}

}
