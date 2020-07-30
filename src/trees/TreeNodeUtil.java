package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeUtil {

	public static List<Integer> bfs(TreeNode root) {

		if(root==null) return null;
		List<Integer> list = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.remove();
			list.add(temp.val);

			if (temp.left != null) {
				queue.add(temp.left);

			}
			if (temp.right != null) {
				queue.add(temp.right);

			}
		}

		return list;

	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		
		if (root == null)
			return list;

		inorderTraversal1(root, list);
		return list;
	}

	public static void inorderTraversal1(TreeNode root, List<Integer> list) {

		if (root == null)
			return;
		inorderTraversal1(root.left, list);
		list.add(root.val);
		inorderTraversal1(root.right, list);
	}
	
	
	public static List<Integer> postorderTraversal(TreeNode root) {
        
		List<Integer> list = new ArrayList<>();
		
		if (root == null)
			return list;

		postorderTraversal1(root, list);
		return list;
		
    }

	public static TreeNode createBST(int n) {
		TreeNode root = null;

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < n; i++) {

			list.add(i);
		}

		Collections.shuffle(list);

		System.out.println(list);

		for (int i : list) {
			if (root == null) {
				root = new TreeNode(i);
			} else {
				root = addNode(root, new TreeNode(i));
			}

		}
		return root;

	}

	private static TreeNode addNode(TreeNode root,TreeNode node){
		
		if(node.left==null && node.right==null) return node;
		if(node.val<root.val){
			return root.left=addNode(root.left, node);
		}else if(node.val>root.val){
			return root.left=addNode(root.right, node);
		}
		return root;
	}
	
	private static TreeNode addNodeRight(TreeNode root,TreeNode node){
		
		if(node==null){
			
		}else{
			
		}
		
		return node;
	}

	private static void postorderTraversal1(TreeNode root, List<Integer> list) {

		if (root == null)
			return;
		postorderTraversal1(root.left, list);
		postorderTraversal1(root.right, list);
		list.add(root.val);
	}
	

}
