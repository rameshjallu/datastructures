package linkedlist;

public class Demo {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);
		ListNode node4 = new ListNode(40);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		int k=1;
		
		int v=rev(node1, k);
		System.out.println(v);
		if(v==k) {
			node1=node1.next;
		}
		System.out.println();
		
		
		while (node1 != null) {
			System.out.println(node1.val + " ");
			node1 = node1.next;
		}

	}

	
	public static int rev(ListNode node, int k) {
		if (node != null) {
			int v=1+rev(node.next, k);
			if (k == v-1) {
				node.next = node.next.next;
			}
			return v;
		}
		return 0;
	}
}
