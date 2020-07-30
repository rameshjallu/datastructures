package linkedlist;

import java.util.HashSet;
import java.util.Set;
public class ReverseLL {

	public static boolean hasCycle1(ListNode head) {

		if(head==null) return false;
		Set<ListNode> set=new HashSet<>();
		while(head.next!=null){
			if(set.contains(head)){
				return true;
			}
			else{
				set.add(head);
				head=head.next;
				
			}
		}
		return false;
	}
	
	public static boolean hasCycle(ListNode head) {

		if(head==null) return false;
		
		ListNode first=head;
		ListNode second=head;
		if(first==second) {
			if(second.next==first){
				System.out.println(first);
				return true;
			}
			
			
		}
		
		if(second.next!=null){
			second=second.next.next;
		}else{
			return false;
		}
		while(true){
			if(first==second){
				System.out.println(first);
				return true;
			}
			else{
				if(first==null || second==null || second.next==null){
					return false;
				}
				second=second.next.next;
				first=first.next;
				
			}
		}
		
	}
	

	public static void main(String[] args) {

		ListNode head=new ListNode(1);
		ListNode head1=new ListNode(2);
		ListNode head2=new ListNode(3);
		ListNode head3=new ListNode(4);
		ListNode head4=new ListNode(5);
		ListNode head5=new ListNode(6);
		
		head.next=head1;
		head1.next=head2;
		head2.next=head3;
		head3.next=head2;
		/*head4.next=head5;
		head5.next=head3;*/
		
		System.out.println(hasCycle(head));
		
		
		
	}

	public static void display(Node head) {

	}
}
