package linkedlist;

import LLUtil.LLUtil;

public class DeleteNthNodeFromLast {

	public static ListNode nodef=null;
	public static void main(String[] args) {

		int nums[] = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		ListNode node = LLUtil.createLL(nums);

		LLUtil.display(node);
		
		LLUtil.display(removeNthFromEnd(node, 3));

	}
	
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
		 
		 ListNode node=head;
			
			
			
			auxDeleteNode(null, node, n);
			
			if(nodef==null){
				nodef=node;
			}
			//LLUtil.display(nodef);
			
			return nodef;
	 }
	
	/*public static ListNode deleteNode(ListNode root,int n){
		
		ListNode node=root;
		
		
		
		auxDeleteNode(null, node, n);
		
		if(nodef==null){
			nodef=node;
		}
		LLUtil.display(nodef);
		
		return nodef;
	}*/
	
	public static int auxDeleteNode(ListNode prev,ListNode node,int n){
		
		if(node==null){
			return 1;
		}
		
		int size=auxDeleteNode(node, node.next, n);
		if(size==n){
			
			if(prev==null){
				nodef=node.next;
			}else if(node==null){
				
			}else{
				prev.next=node.next;
			}
			
		}
		return size+1;
	}

}
