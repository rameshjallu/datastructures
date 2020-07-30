package list_queue_stack;

import java.util.Stack;

public class ValidParanthesis {

	
	public static void main(String[] args) {
		
		String s= "{{{}}}";
		
		System.out.println(valid(s));
	}
	
	public static boolean valid(String s){
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch=='{'){
				stack.push(ch);
			}else{
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) return true;
		
		return false;
	}
}
