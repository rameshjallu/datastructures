package trees;

public class TreeNodeLevel {

	public TreeNode node;
	int level;
	
	public TreeNodeLevel(TreeNode node,int level){
		this.node=node;
		this.level=level;
	}

	@Override
	public String toString() {
		return  "level " + level+" : val: "+node.val+"\n";
	}
	
	
}
