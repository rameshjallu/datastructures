package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU {

	private  static LinkedList<Node> list=new LinkedList<>();
	private static Map<Integer, Node> map=new HashMap<>();
	private static int CAPACITY=5;
	
	public static void main(String[] args) {
		
		LRU lru=new LRU();
		
		
		
	}
	
	public Node put(int key,String value){
		Node node=map.get(key);
		
		if(node!=null){
			
			node.value=value;
			
			map.put(key, node);
			
			
		}else{
			
			if(list.size()==CAPACITY){
				
			}
			
		}
		
		
		return node;
	}
	public int get(int key){
		
		return 0;
	}
	public void removeFirstAddLast(){
		
	}
	
	public void display(){
		System.out.println(list);
	}
	class Node{
		
		int key;
		String value;
		Node next;
		Node prev;
		
		public Node(int key,String value){
			this.key=key;
			this.value=value;
		}
	}
}
