package linkedlist;

import LLUtil.LLUtil;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {

	public static void main(String[] args) {

		/*int nums[] = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		ListNode node = LLUtil.createLL(nums);*/

		ListNode node=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(4);
		ListNode node4=new ListNode(5);
		
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node3;
		
		//node3.next=null;	
		
		//LLUtil.display(node);

		System.out.println(detectCycle(node));
		
		// LLUtil.display(removeNthFromEnd(node, 3));

	}

	public static ListNode detectCycle(ListNode head) {

		if(head==null) return null;
		
		if(head.next==null) return null;
		
		ListNode first = head;
		ListNode second = head;

		boolean cycle = false;

		while (first != null && second != null && second.next != null) {

			first = first.next;
			second = second.next.next;
			
			if (first == second) {
				cycle = true;
				break;
			}
		}

		System.out.println("cycle found "+cycle);
		
		if (cycle) {
			second = head;
			while (first != second) {
				first = first.next;
				second = second.next;
			}
			return second;
		}

		return null;

	}

}