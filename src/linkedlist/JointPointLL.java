package linkedlist;

import LLUtil.LLUtil;

public class JointPointLL {

	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		/*ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;*/

		
		ListNode head1 = new ListNode(11);
		/*ListNode head2 = new ListNode(12);
		ListNode head3 = new ListNode(13);
		ListNode head4 = new ListNode(14);
		ListNode head5 = new ListNode(15);

		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next=l5;*/

		
		LLUtil.display(l1);
		LLUtil.display(head1);
		
		System.out.println(LLUtil.returnJoint(l1, head1));
		
		LLUtil.display(l1);
		LLUtil.display(head1);
	}
}
