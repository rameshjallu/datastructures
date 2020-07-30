package map;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private LinkedNode first;
	private LinkedNode last;
	private Map<Integer, LinkedNode> map = new HashMap<>();
	private int capacity ;

	public static void main(String[] args) {

		/*LRUCache cache = new LRUCache( 2  capacity  );

		cache.put(1, 1);
		cache.put(2, 2);
		
		cache.display();
		System.out.println("cache.get(1) "+cache.get(1));       // returns 1
		cache.display();
		
		cache.put(3, 3);    // evicts key 2
		System.out.println("cache.get(2) "+cache.get(2));       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		System.out.println(cache.get(1));       // returns -1 (not found)
		System.out.println(cache.get(3));       // returns 3
		System.out.println(cache.get(4));       // returns 4
*/		
		
		
		LRUCache cache = new LRUCache( 1  );

		cache.put(2, 1);
		System.out.println(cache.get(2));
		
		cache.display();
		
		cache.put(3, 2);    // evicts key 2
		  
		cache.display();
		
		System.out.println(cache.get(2));       // returns -1 (not found)
		System.out.println(cache.get(3));       // returns 2
		
		

	}

	public LRUCache(int capacity) {
		this.capacity=capacity;
	}
	public LinkedNode put(int key, int value) {

		LinkedNode linkedNode = map.get(key);

		if (linkedNode != null) {
			linkedNode.value = value;
		} else {

			if (map.size() >= capacity) {
				removeFirst();
			}
			linkedNode = new LinkedNode(key, value);

			addLast(linkedNode);
			map.put(key, linkedNode);
		}

		return linkedNode;
	}

	public void removeFirst() {

		if(map.size()==1){
			map.clear();
			first=null;
			last=null;
		}else{
			LinkedNode temp = first;

			map.remove(temp.key);

			temp.next.prev = null;
			first = temp.next;
		}
		

	}

	public void display() {
		LinkedNode linkedNode = first;

		//System.out.println("disp start");
		while (linkedNode != null) {

			//System.out.print(linkedNode.key + "=" + linkedNode.value + "	");
			linkedNode = linkedNode.next;
		}
		//System.out.println("disp end");
		
	}

	public void removeAndAddLast(LinkedNode linkedNode) {


		LinkedNode temp=linkedNode;
		
		if(linkedNode.prev==null){
		/*
		 * accesses first element
		 */
			linkedNode.prev.next = linkedNode.next;
		}else if(linkedNode.prev!=null && linkedNode.next==null){
			/*
			 * accesses last ele
			 */
			first=first.next;
		}else{
			/*
			 * accessed middle element
			 */
			
			
		}
		

		temp.prev=last;
		
		last.next = linkedNode;
		linkedNode.next=null;
	}

	public void addLast(LinkedNode linkedNode) {

		if (first == null) {
			first = linkedNode;
			last = linkedNode;

			

		} else {

			LinkedNode temp = first;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = linkedNode;

			linkedNode.prev = temp;
			last = linkedNode;
		}
	}

	public int get(int key) {
		
			LinkedNode linkedNode = map.get(key);

			if(linkedNode==null){
				return -1;
			}else{
				if(map.size()==1){
					
					return linkedNode.value;
				}
				removeAndAddLast(linkedNode);

				return linkedNode.value;
			}
		
		
		
	}

	/*public int get(int key) {
		LinkedNode linkedNode = map.get(key);
		if(linkedNode!=null){
			return linkedNode.value;
		}else{
			return -1;
		}
	}*/
	class LinkedNode {
		LinkedNode next;
		LinkedNode prev;
		int key;
		int value;

		public LinkedNode(int key, int value) {
			this.key = key;
			this.value = value;
			next = null;
			prev = null;

		}

		@Override
		public String toString() {
			return key + "=" + value + ", ";
		}

	}
}
