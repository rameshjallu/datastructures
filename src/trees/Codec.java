package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
		
		
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

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list= new ArrayList<>(Arrays.asList(data.split(",")));
		TreeNode temp=deserialize(list);
		return temp;
    }
    
    public TreeNode deserialize(List<String> list){
		
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
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
