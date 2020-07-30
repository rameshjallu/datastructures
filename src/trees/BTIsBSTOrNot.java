package trees;

public class BTIsBSTOrNot {

	public static int temp=Integer.MIN_VALUE;
	public static boolean flag=true;
	
	public static void main(String[] args) {
		
		/*
		 * 			14	
		 * 		5		25
		 *  2     7 
		 * 
		 */ 
		
		
				
				
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node7 = new TreeNode(7);
		TreeNode node14 = new TreeNode(14);
		TreeNode node25 = new TreeNode(25);

		node5.left = node2;
		node5.right = node7;

		node14.left = node5;

		node14.right = node25;
		
		
		//[5,1,4,null,null,3,6]
		
		/*TreeNode node5 = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node4 = new TreeNode(14);
		TreeNode node3 = new TreeNode(13);
		TreeNode node6 = new TreeNode(16);

		node5.left = node1;
		node5.right = node4;

		node4.left = node3;

		node4.right = node6;*/
		
		
		//[2147483644,-2147483648,2147483646,null,null,2147483645,2147483647]
				
		TreeNode node2147483644 = new TreeNode(2147483644);
		TreeNode node2147483648n = new TreeNode(-2147483648);
		TreeNode node2147483646 = new TreeNode(2147483646);
		
		TreeNode node2n = new TreeNode(-2);
		
		//node0.left=node1n;
		//node0.right=node2n;
		
		
		//System.out.println(TreeNodeUtil.bfs(node14));
		
		System.out.println(TreeNodeUtil.postorderTraversal(node14));
		
		//System.out.println(getMin(node14).val);
		//System.out.println(getMax(node14).val);
		
	}
	
	/*public static boolean isValidBST(TreeNode root) {
		


		if (root == null)
			return true;
       
		isValidBST(root.left);
		if (temp > root.val) {

			flag = false;
            
            return flag;
		} else {
			temp = root.val;
		}

		isValidBST(root.right);

		return flag;
		
	}*/
	
	public static boolean isValidBST(TreeNode root) {
		
		return isValidBST1( root,Long.MIN_VALUE,Long.MAX_VALUE);
	}
	
	public static boolean isValidBST1(TreeNode root,long min,long max) {
		if(root==null) return true;
		else 
			return (root.val>min)&&(root.val<max) && isValidBST1(root.left, min, root.val) && isValidBST1(root.right, root.val, max);
	}

	public static TreeNode getMin(TreeNode node) {

		if(node==null) return null;
		while (node.left != null) {
			node = node.left;
		}

		return node;

	}

	public static TreeNode getMax(TreeNode node) {

		if(node==null) return null;
		
		while (node.right != null) {
			node = node.right;
		}

		return node;

	}
	
}
