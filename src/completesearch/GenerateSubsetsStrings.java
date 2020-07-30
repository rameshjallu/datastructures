package completesearch;



public class GenerateSubsetsStrings {

	public static void main(String[] args) {


		String in="abc";
		subsets(in, "");
	}
	
	public static void subsets(String in,String out){
		
		auxSubsets(in, "");
	}


	public static void auxSubsets(String in,String out){
		System.out.println(out);
		if(0==in.length()) {
			return;
		}else{
			for(int i=0;i<in.length();i++){
				auxSubsets(in.substring(i+1), out+in.charAt(i));
			}
		}
	}

}
