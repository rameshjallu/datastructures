package completesearch;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	/*
	 * 	a1a2 b1b2 c1c2
	
		a1b1c1c2b2a2
		a1b1b2c1c2a2
		a1b1b2a2c1c2
		a1a2b1c1c2b2
		a1a2b1b2c1c2
	 */
	public static void main(String[] args) {
		
		generateParenthesis("a1a2b1b2c1c2");
	}
	
	public static List<List<String>> generateParenthesis(String in){
		List<String> list=new ArrayList<>();
		List<List<String>> finalList=new ArrayList<>();
		
		auxPenerateParenthesis(in, list, finalList);
		
		return finalList;
		
	}
	
	public static List<String> auxPenerateParenthesis(String in,List<String> list,List<List<String>> finalList){
		if(in.length()==2){
			list.add(in);
			return list;
		}
		
		for(int i=0;i<in.length();i++){
			
			for(String s:auxPenerateParenthesis(in.substring(i+2), list, finalList)){
				//list.add(in.char)
			}
		}
		return null;
	}
}
