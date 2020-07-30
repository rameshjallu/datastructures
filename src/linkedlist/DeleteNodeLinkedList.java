package linkedlist;

public class DeleteNodeLinkedList {

	public static void main(String[] args) {
		
		Node node1=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		Node node4=new Node(40);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		
		
		deleteNode(node2);
		
		Node node=node1;
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}
	
	public static void deleteNode(Node node) {
		node.data=node.next.data;
		node.next=node.next.next;
	}
}
