package list_queue_stack;

import java.util.Stack;

public class StackReversal {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		
		reverse(stack);
		
		System.out.println(stack);
		
	}
	
	public static void reverse(Stack<Integer> stack){
		
		int ele;
		
		if(!stack.isEmpty()){
			
			ele=stack.pop();
			reverse(stack);
			
			stack.push(ele);
		}
	}
}
