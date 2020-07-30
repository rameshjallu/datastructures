package list_queue_stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MagicQueue {

	

	static Queue<Integer> queue=new LinkedList<>();
	
	static Deque<Integer> deque=new LinkedList<>();
	
	public static void main(String[] args) {
		
		
		
		offer(5);
		offer(4);
		
		offer(8);
		offer(16);
		offer(67);
		offer(9);
		
		
		
		
		System.out.println(queue);
		System.out.println(deque);
		
		poll();
		poll();
		
		System.out.println(queue);
		System.out.println(deque);
		
		System.out.println("min "+getMin());
		
		
		//System.out.println(deque);
		
		System.out.println();
		
	}
	
	public static void offer(int i){
		queue.offer(i);
		
		if(deque.isEmpty()){
			deque.offer(i);
		}else{
			
			while(!deque.isEmpty() && i<deque.getLast()){
				deque.removeLast();
			}
			deque.offer(i);
		}
	}
	
	
	public  static  int poll(){
		
		int temp=queue.poll();
		
		if(temp==deque.getFirst()){
			deque.removeFirst();
		}
		return Integer.MIN_VALUE;
	}
	
	public static int getMin(){
		if(!deque.isEmpty()){
			return deque.getFirst();
		}else{
			return Integer.MIN_VALUE;
		}
	}
}
