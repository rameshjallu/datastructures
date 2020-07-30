package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeLevelsPrintingDemo {

	static List<Integer> res = new ArrayList();
	
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

		System.out.println(rightSideViewCopy(node1));
		//System.out.println(levelPrint(node1));
	}

	public static  List<Integer> bfs(TreeNode root) {
		
		List<Integer> list = new ArrayList<>();
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		
		queue.add(root);
		
		
		while(!queue.isEmpty()){
			
			TreeNode temp=queue.remove();
			list.add(temp.val);
			
			if(temp.left!=null){
				queue.add(temp.left);
				
			}
			if(temp.right!=null){
				queue.add(temp.right);
				
			}
		}
		
		
		return list;
		
	}
	public static  List<Integer> levelPrint(TreeNode root) {

		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

		List<Integer> list = new ArrayList<>();

		
		
		if (root == null)
			return list;

		Queue<TreeNodeLevel> queue = new LinkedList<>();

		queue.add(new TreeNodeLevel(root, 0));

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(root.val);

		map.put(0, list1);

		while (!queue.isEmpty()) {

			TreeNodeLevel temp = queue.remove();
			if (temp.node.left != null) {
				queue.add(new TreeNodeLevel(temp.node.left, temp.level + 1));

				if (map.containsKey(temp.level + 1)) {

					ArrayList<Integer> list3 = map.get(temp.level + 1);
					list3.add(temp.node.left.val);
					map.put(temp.level + 1, list3);

				} else {
					ArrayList<Integer> list2 = new ArrayList<>();
					list2.add(temp.node.left.val);
					map.put(temp.level + 1, list2);
				}
			}
			if (temp.node.right != null) {
				queue.add(new TreeNodeLevel(temp.node.right, temp.level + 1));

				if (map.containsKey(temp.level + 1)) {

					ArrayList<Integer> list3 = map.get(temp.level + 1);
					list3.add(temp.node.right.val);
					map.put(temp.level + 1, list3);

				} else {
					ArrayList<Integer> list2 = new ArrayList<>();
					list2.add(temp.node.right.val);
					map.put(temp.level + 1, list2);
				}

			}
		}

		for (Map.Entry<Integer, ArrayList<Integer>> me : map.entrySet()) {
			list.add(me.getValue().get(me.getValue().size() - 1));
		}

		return list;
		
	}

	public static void leftView(TreeNode treeNode) {

		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> leftQueue = new LinkedList<>();
		TreeNode dummy = new TreeNode(-9999999);
		queue.add(treeNode);
		leftQueue.add(treeNode);
		leftQueue.add(dummy);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.remove();
			// System.out.println(temp.val);
			boolean hasChild = false;
			if (temp.left != null) {
				queue.add(temp.left);
				leftQueue.add(temp.left);
				hasChild = true;

			}
			if (temp.right != null) {
				queue.add(temp.right);
				leftQueue.add(temp.right);
				hasChild = true;
			}
			if (hasChild) {
				leftQueue.add(dummy);
			}

		}
		System.out.println(leftQueue);

		int prev = -9999999;

		while (!leftQueue.isEmpty()) {

			TreeNode temp = leftQueue.remove();

			int val = temp.val;

			if (temp.val != -9999999) {
				prev = val;
			} else {
				System.out.println(prev);
			}

		}

	}

	public static List<Integer> rightSideView(TreeNode root) {

		if (root == null)
			return null;

		List<Integer> list = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> leftQueue = new LinkedList<>();
		TreeNode dummy = new TreeNode(-9999999);
		queue.add(root);
		leftQueue.add(root);
		leftQueue.add(dummy);

		while (!queue.isEmpty()) {

			TreeNode temp = queue.remove();
			// System.out.println(temp.val);
			boolean hasChild = false;
			if (temp.left != null) {
				queue.add(temp.left);
				leftQueue.add(temp.left);
				hasChild = true;

			}
			if (temp.right != null) {
				queue.add(temp.right);
				leftQueue.add(temp.right);
				hasChild = true;
			}
			if (hasChild) {
				leftQueue.add(dummy);
			}

		}
		System.out.println(leftQueue);

		int prev = -9999999;

		while (!leftQueue.isEmpty()) {

			TreeNode temp = leftQueue.remove();

			int val = temp.val;

			if (temp.val != -9999999) {
				prev = val;
			} else {
				System.out.println(prev);
				list.add(prev);
			}

		}

		return list;
	}
	
	
	    public static List<Integer> rightSideViewCopy(TreeNode root) {
	        dfs(root, 0);
	        return res;
	    }
	    
	    public static void dfs (TreeNode node, int depth) {
	        if (node == null) {
	            return;
	        }
	        if (depth == res.size()) {
	            res.add(node.val);
	        }
	        
	        dfs(node.right, depth+1);
	        dfs(node.left, depth+1);
	    }


}
