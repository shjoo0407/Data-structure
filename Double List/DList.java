import java.util.NoSuchElementException;

public class DList <E>{
	protected DNode head, tail;
	protected int size;
	
	public DList() {
		head = new DNode(null,null,null);
		tail = new DNode(null,head,null);
		head.setNext(tail);
		
	}
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newnode = new DNode(newItem,t,p);
		p.setPrevious(newnode);
		t.setNext(newnode);
		size++;
	}
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newnode = new DNode(newItem, p, t);
		p.setNext(newnode);
		t.setPrevious(newnode);
		size++;
	}
	
	public void delete(DNode p) {
		if(p==null) throw new NoSuchElementException();
		
		DNode f = p.getPrevious();
		DNode r = p.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
		
	}
	public void print() {
		if(size>0) {
			for(DNode p=head.getNext();p!= tail;p=p.getNext())
				System.out.print(p.getItem()+"\t");
		}
		else
			System.out.println("리스트 비어있음.");
		System.out.println();
	}
	
	
	public int size() {return size;}
	public boolean isEmpty() {return size ==0;}
	
	
	
	
	
}

