import java.util.Random;

import linkedlist.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {

	/**
	 * @param head
	 *            The linked list's head. Note that the head is guaranteed to be
	 *            not null, so it contains at least one node.
	 */

	ListNode head;

	public Solution(ListNode head) {
		this.head = head;
	}

	/** Returns a random node's value. */
	public int getRandom() {

		ListNode temp = this.head;
		ListNode random = this.head;

		int c = 1;

		for (; temp != null; temp = temp.next) {

			int r = new Random().nextInt(c) + 1;

			c++;
			if (r == 1) {
				random = temp;
			}

		}
		return random.val;

	}

	public static void main(String[] args) {

		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);

		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;

		Solution obj = new Solution(head1);
		int param_1 = obj.getRandom();

		System.out.println(param_1);
	}
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(head); int param_1 = obj.getRandom();
 */