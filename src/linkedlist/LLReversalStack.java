package linkedlist;

import java.util.Stack;

import LLUtil.LLUtil;

public class LLReversalStack {

	public static void main(String[] args) {

		int nums[] = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		ListNode node = LLUtil.createLL(nums);

		LLUtil.display(node);

		Stack<ListNode> stack=new Stack<>();
		
		for(;node!=null;node=node.next){
			stack.push(node);
		}
		
		
		//System.out.println(stack);
		
		
		ListNode first=stack.pop();
		ListNode root=first;
		
		while(!stack.isEmpty()){
			ListNode next=stack.pop();
			first.next=next;
			first=next;
			
		}
		
		first.next=null;
		
		LLUtil.display(root);

		
	}
}
