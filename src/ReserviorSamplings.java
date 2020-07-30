import java.util.Random;

import linkedlist.ListNode;

public class ReserviorSamplings {

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

		display(head1);
		System.out.println("size "+size(head1));
		System.out.println(returnRandomInSteamLL(head1));
	}

	public static int size(ListNode head) {

		int size = 0;

		ListNode temp = head;

		for (; temp != null; temp = temp.next) {
			
			size++;
		}

		return size;
	}

	
	public static ListNode returnRandomInFixedLL(ListNode head) {

		ListNode temp = head;

		int c=0;
		int size = size(head);
		
		int random=new Random().nextInt(size)+1;

		System.out.println("random "+random);
		
		for (; temp != null && random>=0; temp = temp.next) {
			c++;
			if(c==random){
				return temp;
			}
			
		}
		return temp;
	}
	
	public static ListNode returnRandomInSteamLL(ListNode head) {

		ListNode temp = head;
		ListNode random = head;

		int c=1;
		
	
		for (; temp != null ; temp = temp.next) {
			
			int r=new Random().nextInt(c)+1;
			c++;
			if(r==1){
				random=temp;
			}
			
		}
		//System.out.println(size);
		return random;
	}
	
	public static int display(ListNode head) {

		int size = 0;

		ListNode temp = head;

		for (; temp != null; temp = temp.next) {
			
			System.out.print(temp.val+",");
		}
		System.out.println();

		return size;
	}
}
