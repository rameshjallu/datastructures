package list_queue_stack;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {

		/*
		 * s = "3[a]2[bc]", return "aaabcbc". 
		 * s = "3[a2[c]]", return "accaccacc". 
		 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
		 */
		
		String s="3[a]";
		
		System.out.println(decodeString(s));
		
		
	}

	public static String decodeString(String s) {

		StringBuilder builder=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			if(ch==']'){
				
				StringBuilder b=new StringBuilder();
				
				char pop=stack.pop();
				while(pop=='['){
					b.append(pop);
					pop=stack.pop();
				}
				
				builder.append(b);
			}else
			{
				stack.push(ch);
				
				//System.out.println(stack);
			}
		}
		return builder.toString();
	}

}
