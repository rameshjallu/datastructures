package completesearch;

public class AllPartitions {

	public static void main(String[] args) {

		String in = "abc";

		allPartitions(in);

	}

	public static void allPartitions(String in) {

		auxAllPartitions(in, "");
	}

	public static void auxAllPartitions(String in, String out) {

		if (in.length() == 0) {
			System.out.println(out);
			return;
		}
		for (int i = 0; i < in.length(); i++) {
			if(out.length()==0){
				auxAllPartitions(in.substring(i + 1),  "("+in.substring(0, i + 1)+")" );
			}else{
				auxAllPartitions(in.substring(i + 1),  "("+in.substring(0, i + 1)+")"+"("+out+")" );
			}
			
		}

	}
}
