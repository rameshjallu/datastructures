package ternary_tree;


class TSTNode{
	
	public boolean isWord;
	public char data;
	public TSTNode left;
	public TSTNode right;
	public TSTNode middle;
	
	
	
	public TSTNode(char data) {
		super();
		this.data = data;
	}

	
	
}
public class TernaryTreeDemo {

	public static TSTNode root;
	
	public static void main(String[] args) {
		
		
	}
	
	public static TSTNode addNode(String str,int position){
		
		if(root==null){
			root=new TSTNode(str.charAt(position));
		}
		
		TSTNode temp=root;
		
		return temp;
		
	}
}
