
public class AVL <Key extends Comparable<Key>,Value> {
	public Node root;
	public Node getRoot() {return root;}
	
	public AVL(Key newId, Value newName) {
		root = new Node(newId, newName);
	}
	public void put(Key k,Value v) {root = put(root,k,v);}
	
}
