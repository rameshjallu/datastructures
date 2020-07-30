package list_queue_stack;

import java.util.Stack;

public class PrintNumbersReverse {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		
		
		stack.push(38);
		stack.push(2);
		stack.push(24);

		System.out.println("stack peek "+stack);
		
		printStack(stack);
		
		System.out.println("stack peek "+stack);

	}

	public static void print(int n) {

		if (n == 0) {
			return;
		} else {

			print(n - 1);
			System.out.println(n);
		}
	}

	public static Stack<Integer>   printStack(Stack<Integer> stack) {

		

			System.out.println(stack);
			

			if (stack.size()==0){
				return stack;
			}else
			{
				int ele = stack.pop();
				
				Stack<Integer> stack1=printStack(stack);
				
				
				stack1.push(ele);
				return stack1;
				
				
			}
			
		
	}
}
