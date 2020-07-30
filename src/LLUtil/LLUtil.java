package LLUtil;

import linkedlist.ListNode;

public class LLUtil {

	public static ListNode prepareList(int n) {
		ListNode head = null;
		for (int i = 1; i < n; i++) {

		}
		return head;
	}

	public static int size(ListNode head) {

		int size = 0;

		ListNode temp = head;

		for (; temp != null; temp = temp.next) {

			size++;
		}

		return size;
	}

	public static void display(ListNode head) {

		int size = 0;

		ListNode temp = head;

		for (; temp != null; temp = temp.next) {

			//System.out.print(temp.val + ":"+temp.hashCode()+",");
			System.out.print(temp.val +"-");
		}
		System.out.println();

	}

	public static ListNode moveListByPositions(ListNode listNode, int pos) {

		for (int i = 1; i <= pos; i++) {
			listNode = listNode.next;
		}
		return listNode;
	}

	public static ListNode returnJoint(ListNode headA, ListNode headB) {

		if(headA==null || headB==null) return null;
		
		int m = size(headA);
		int n = size(headB);

		if (m > n) {
			headA = moveListByPositions(headA, m - n);
		} else if (n > m) {
			headB = moveListByPositions(headB, n - m);
		}

		for (int i = 1; i <= m; i++) {

			
			if (headA == headB) {
				return headA;
			} else {
				headA = headA.next;
				headB = headB.next;
			}
		}

		return null;

	}

	public static ListNode createLL(int[] nums) {

		ListNode root = null;
		ListNode prev = null;

		for (int data : nums) {
			if (root == null) {
				root = new ListNode(data);
				prev = root;
			} else {
				ListNode temp = new ListNode(data);
				prev.next = temp;
				prev = temp;
			}
		}
		return root;
	}

	
}
