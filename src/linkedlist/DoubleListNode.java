package linkedlist;

public class DoubleListNode {

	public int val;
	public DoubleListNode prev;
	public DoubleListNode next;

	public DoubleListNode(int x) {
		val = x;
		prev = null;
		next = null;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + "]";
	}

}
