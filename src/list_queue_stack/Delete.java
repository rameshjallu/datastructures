package list_queue_stack;

import java.util.Deque;
import java.util.LinkedList;

public class Delete {

	static Deque<Integer> deque=new LinkedList<>();
	
	public static void main(String[] args) {
		
		
		
		deque.offer(5);
		deque.offer(4);
		deque.offer(8);
		deque.offer(6);
		
		
		
		
		System.out.println(deque);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		System.out.println(deque);
		
		//System.out.println(deque);
		
		System.out.println();
		
	}
	
}
