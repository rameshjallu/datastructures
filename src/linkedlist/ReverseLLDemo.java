package linkedlist;

import LLUtil.LLUtil;

public class ReverseLLDemo {

	public static ListNode root=null;
	public static ListNode first=null;
	
	public static void main(String[] args) {
		
		int nums[]=new int[10];
		
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		
		ListNode node =LLUtil.createLL(nums);
		
		LLUtil.display(node);
		
		/*//printReverseRec(node);
		
		ListNode root =null;
		getReverseRec(node,0,root);
		
		System.out.println(root);
		
		LLUtil.display(root);
		
		
		LLUtil.display(node);
		*/
		
		System.out.println(root);
		
		getReverseRec(node).next=null;
		
		System.out.println(root);
		
		LLUtil.display(root);
	}
	
	public static void printReverseRec(ListNode node){
		
		if(node==null){
			return ;
		}else{
			
			printReverseRec(node.next);
			System.out.print(node.val+"-");
			
		}

	}

	/*
	 * ListNode first=stack.pop();
		ListNode root=first;
		
		while(!stack.isEmpty()){
			ListNode next=stack.pop();
			first.next=next;
			first=next;
			
		}
		
		first.next=null;
	 */
	public static ListNode getReverseRec(ListNode node,int c,ListNode root){
		
		//System.out.println("c,node,temp "+c+","+node.val+","+root);
		
		
		c++;
		if(node.next==null){
			
			root=node;
			//System.out.println("node next null "+node.val+" : "+root.val);
			return node;
		}else{
			
			ListNode next= getReverseRec(node.next,c,root);
			
			node.next=next;
			
			return next;
			
			
			
		}

	}
	
	public static ListNode getReverseRec(ListNode node){
		if(node.next==null){
			root=node;
			return root;
		}else{
			return getReverseRec(node.next).next=node;
		}
	}
	
	public static ListNode reverse(ListNode node){
		
		ListNode root=null;
		ListNode next=node;
		
		while(next!=null){
			
			if(root==null){
				root=next;
				next=next.next;
			}else{
				ListNode temp=next;
				next.next=root;
				//root.next=temp;
				root=next;
				next=temp.next;
			}
		}
		
		return root;
	}
}
