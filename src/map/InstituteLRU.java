package map;

import java.util.HashMap;
import java.util.Map;

public class InstituteLRU {

	private LinkedNode first;
	private LinkedNode last;
	private Map<Integer, LinkedNode> map = new HashMap<>();
	private int capacity = 2;

	public static void main(String[] args) {

		InstituteLRU lru = new InstituteLRU();

		for (int i = 1; i <= 71; i++) {
			lru.put(i, "value" + i);
		}

		lru.get(69);

		lru.display();

	}

	public LinkedNode put(int key, String value) {

		LinkedNode linkedNode = map.get(key);

		if (linkedNode != null) {
			linkedNode.value = value;
		} else {

			if (map.size() == capacity) {
				removeFirst();
			}
			linkedNode = new LinkedNode(key, value);

			addLast(linkedNode);
			map.put(key, linkedNode);
		}

		return linkedNode;
	}

	public void removeFirst() {

		LinkedNode temp = first;

		map.remove(temp.key);

		first.next.prev = null;
		first = temp.next;

	}

	public void display() {
		LinkedNode linkedNode = first;

		while (linkedNode != null) {

			System.out.print(linkedNode.key + "=" + linkedNode.value + "	");
			linkedNode = linkedNode.next;
		}
	}

	public void removeAndAddLast(LinkedNode linkedNode) {

		//System.out.println(linkedNode);

		LinkedNode temp=linkedNode;
		
		linkedNode.prev.next = linkedNode.next;

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

	public LinkedNode get(int key) {
		LinkedNode linkedNode = map.get(key);

		removeAndAddLast(linkedNode);

		return linkedNode;
	}

	class LinkedNode {
		LinkedNode next;
		LinkedNode prev;
		int key;
		String value;

		public LinkedNode(int key, String value) {
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
