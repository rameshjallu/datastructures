package trees;

public class TreeSize {

	
	public static void main(String[] args) {
		
		TreeNode node1=new TreeNode(-1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(-5);
		TreeNode node6=new TreeNode(6);
		
		node1.left=node2;
		node1.right=node3;
		
		node2.left=node4;
		node2.right=node5;
		
		node3.right=node6;
		
		System.out.println(treeSize(node1));
		
		
		
	}
	
	public static int treeSize(TreeNode node){
		
		if(node==null) return 0;
		
		return treeSize(node.left)+treeSize(node.right)+1;
	}
	
	public static int treeNodesValuesSum(TreeNode node){
		
		
		if(node.left==null && node.right==null){
			return node.val;
		}
		else if(node.left==null){
			return treeNodesValuesSum(node.right)+node.val;
		}else if(node.right==null){
			return treeNodesValuesSum(node.left)+node.val;
		}else{
			return treeNodesValuesSum(node.left)+treeNodesValuesSum(node.right)+node.val;
		}
		
	}
}
