package recursion;

import trees.TreeNode;
import trees.TreeNodeUtil;

public class LongestUnivaluePath {

	public static int pathLength=0;
	
	public static void main(String[] args) {
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;

		node2.right = node5;

		node3.right = node4;
		
		System.out.println(TreeNodeUtil.bfs(node1));
		
	}
	
	 public static int longestUnivaluePath(TreeNode root,int length) {
	        
		 if(root.left!=null){
			 if(root.val==root.right.val){
				 longestUnivaluePath(root.right,length++);
			 }
		 }
		 if(root.right!=null){
			 
			 if(root.val==root.right.val){
				 longestUnivaluePath(root.right,length++);
			 }
		 }
		
		 return pathLength;
	    }
	 
}
