package list_queue_stack;

import java.util.Stack;

public class MagicStack {
	public static Stack<Integer> st_mins=new Stack<>();;
	public static Stack<Integer> st_eles=new Stack<>();;
	
	
	public static void main(String[] args) {
		
		// 12,13,1,6
		
		push(-6);
		push(12);
		push(13);
		push(15);
		
		push(14);
		push(6);
		push(1);
		
		
		System.out.println(st_eles);
		System.out.println(st_mins);
		
		System.out.println("min "+getMin());
		
		System.out.println("pop "+pop());
		System.out.println("min "+getMin());
		System.out.println("pop "+pop());
		System.out.println("min "+getMin());
		System.out.println("pop "+pop());
		System.out.println("min "+getMin());
		
		
	}
	
	
	
	public static void push(int i){
		
		st_eles.push(i);
		
		if(st_mins.isEmpty()){
			st_mins.push(i);
		}else{
			
			if(i<st_mins.peek()){
				st_mins.push(i);
			}
			
		}
		
	}
	
	public static int getMin(){
		
		if(!st_mins.isEmpty()){
			return st_mins.peek();
			
		}
		return Integer.MIN_VALUE;
	}
	
	public static int pop(){
		
		int pop_ele=st_eles.pop();
		
		if(st_mins.peek()==pop_ele){
			st_mins.pop();
		}
		return pop_ele;
	}
	
}
