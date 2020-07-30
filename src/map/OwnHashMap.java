package map;

public class OwnHashMap  {

	private static int SIZE = 10;
	
	private static int MAP_SIZE = 0;

	private static Node[] nodeMap = new Node[SIZE];

	private static Node recentNode;
	
	
	public static int get(int key) {

		int index = generateHahs(key);
		
		Node node = nodeMap[index];
		
		return node.value;
	}

	public static Node[] getMap() {
		return nodeMap;
	}

	public static void removeFirst(){
		
	}
	
	public void put(int key, int value) {

		Node incomingNode = new Node(key, value);
		
		recentNode=incomingNode;
		
		MAP_SIZE++;

		int index = generateHahs(key);

		//System.out.println("hash key "+index);

		if (nodeMap[index] == null) {
			nodeMap[index] = incomingNode;
		} else {
			Node node = nodeMap[index];

			Node temp = node;
			while (temp.next!= null) {
				if (incomingNode.key == temp.key) {
					temp.value = incomingNode.value;
					MAP_SIZE--;
					return;
				}
				temp = temp.next;
			}
			
			if(temp.key==incomingNode.key){
				temp.value = incomingNode.value;
				MAP_SIZE--;
				return;
			}
			temp.next=incomingNode;
			
			
		}

	}

	
	public int getSize() {

		return SIZE;
	}

	public static int size() {

		return MAP_SIZE;
	}
	
	public static int generateHahs(int key) {

		return key % SIZE;
		
	}

	class Node {
		Node next;
		int key;
		int value;

		public Node(int key, int value) {
			super();

			this.key = key;
			this.value = value;
			this.next = null;

		}

		public Node getNode() {
			return next;
		}

		public void setNode(Node node) {
			this.next = node;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		@Override
		public String toString() {

			StringBuilder builder = new StringBuilder();

			Node node = this;

			while (node != null) {
				builder.append("[key=" + node.key + ", value=" + node.value + "]"+"\n");
				node = node.next;
			}
			return builder.toString();
		}

	}
}
