package list_queue_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis2 {

	static Map<Character, Character> matchedMap=new HashMap<>();
	static{
	
		
		matchedMap.put( '}','{');
		matchedMap.put( ')','(');
		matchedMap.put( ']','[');
		
	}
	public static void main(String[] args) {
		
		String s= "[[]{{{}}}[]()]";
		
		System.out.println(valid(s));
	}
	
	public static boolean valid(String s){
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch=='{' || ch=='[' || ch=='('){
				stack.push(ch);
			}else{
				if(stack.isEmpty()) {
					return false;
				}
				
				if(matchedMap.get(ch)!=stack.pop()){
					return false;
				}
				
			}
		}
		
		if(stack.isEmpty()) return true;
		
		return false;
	}
}
