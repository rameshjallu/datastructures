package stack;

import java.util.Stack;

public class InsertLast {

	public static int insert=100;
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		for(int i=1;i<5;i++){
			stack.push(i);
		}
		
		System.out.println(stack);
		
		reverseStack(stack);
		
		System.out.println(stack);
		
	}
	
	public static void reverseStack(Stack<Integer> stack){
		
		if(stack.isEmpty()){
			return;
		}else{
			int ele=stack.pop();
			insertLast(stack,ele);
			
		}
		
	}
	
	public static void insertLast(Stack<Integer> stack,int i){
		
		if(stack.isEmpty()){
			stack.push(i);
		}else{
			int k=stack.pop();
			insertLast(stack,i);
			stack.push(k);
		}
	}
}
