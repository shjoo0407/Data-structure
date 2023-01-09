
public class DNode <E>{
	private E item;
	private DNode previous;
	private DNode next;
	
	public DNode(E newItem,DNode p, DNode q) {
		item = newItem;
		previous = p;
		next = q;
		
	}
	
	public E getItem() {return item;}
	public DNode getNext() {return next;}
	public DNode getPrevious() {return previous;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(DNode p) {next = p;}
	public void setPrevious(DNode q) {previous = q;}
	
}
