package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeDeserializeBinaryTree {

	
	public static String serialize(TreeNode root){
		
		
		StringBuilder sb=new StringBuilder();
		
		if(root==null){
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(serialize(root.left));
		sb.append(serialize(root.right));
		
		return sb.toString();
	}
	
	public static void deserialize(String node){
		List<String> list= new ArrayList<>(Arrays.asList(node.split(",")));
		TreeNode temp=deserialize(list);
		
		System.out.println(TreeNodeUtil.bfs(temp));
		
	}
	
	
	public static TreeNode deserialize(List<String> list){
		
		TreeNode tn=null;
		
		String s=list.remove(0);
		
		if(s.equals("#")){
			return null;
		}else{
			tn=new TreeNode(Integer.parseInt(s));
			tn.left=deserialize(list);
			tn.right=deserialize(list);
			
		}
		return tn;
	
	}
	
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

		//System.out.println(TreeNodeUtil.bfs(null));
		
		//System.out.println(serialize(node1));
		
		deserialize(serialize(node1));
		
	}
}
