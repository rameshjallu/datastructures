package linkedlist;

public class LinkedList {

	public static Node head;

	public static void main(String[] args) {

		add(1);
		add(2);
		add(28);
		add(29);
		add(1);
		add(1);
		add(1);
		add(28);
		add(78);
		add(78);

		/*
		 * add(3); add(3);
		 */

		Node node = returnHead();

		while (node != null) {

			System.out.println(node.data);
			node = node.next;
		}
	}

	public static Node returnHead() {
		return head;
	}

	public static void add(int data) {

		Node incomingNode = new Node(data);

		// System.out.println("incomingNode "+incomingNode.data);

		if (head == null) {
			head = incomingNode;
		} else {

			Node temp = head;
			while (temp.next != null) {

				if (temp.data == incomingNode.data) {
					return;
				}
				temp = temp.next;
			}

			if(temp.data==incomingNode.data) {
				return;
			}
			
			temp.next = incomingNode;
		}

	}

}
