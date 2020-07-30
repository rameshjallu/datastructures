package adhoc;

public class FindDifference {

	public static void main(String[] args) {

		String s="abccc";
		String t="abcccn";
		
		
		System.out.println(findDifference(s, t));
		
		
	}

	public static char findDifference(String s, String t) {

		for(char ch:s.toCharArray()){
			
			t=t.replaceFirst(String.valueOf(ch), "");
			
		}
		
		return t.toCharArray()[0];
	}

}
