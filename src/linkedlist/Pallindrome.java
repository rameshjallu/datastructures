package linkedlist;

public class Pallindrome {
	static ListNode rev = null;

	static boolean b = true;

	public static void main(String[] args) {

		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(20);
		ListNode node4 = new ListNode(10);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		System.out.println("Pallndrome : " + isPalindrome(node1));

	}

	public static boolean isPalindrome(ListNode head) {

		rev = head;

		rev(head);

		return b;
	}

	public static void rev(ListNode node) {

		if (node != null) {
			rev(node.next);
			if (node.val != rev.val) {
				b = false;
				return;
			}
			rev = rev.next;
		}
	}

	public static boolean isPalindromeNew(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			ListNode node = slow.next;
			slow.next = prev;
			prev = slow;
			slow = node;

		}
		if (fast != null && fast.next == null) {
			// odd length
			slow = slow.next;
		}
		while (prev != null && prev.val == slow.val) {
			prev = prev.next;
			slow = slow.next;
		}
		return prev == null;
	}
}
