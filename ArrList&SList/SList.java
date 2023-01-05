//자료구조 과제#2 (60160478 주세현)

import java.util.NoSuchElementException;

public class SList <E extends Comparable<E>>{
	protected Node head; // 연결 리스트의 첫 노드 가리킴
	private int size;
	
	public SList() {
		head = null;
		size = 0;
	}
	public int size() {return size;}
	
	public int search(E target) {
		Node p = head;
		
		for (int k=0; k<size ; k++) {
			if (target == p.getItem()) return k;
			p = p.getNext();
		}
		return -1;
	}
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront() {
		if (isEmpty()) throw new NoSuchElementException();
		
		head = head.getNext();
		size--;
	}
	public boolean isEmpty() {return size == 0;}
	
	public void deleteAfter (Node p) {
		if (p==null)throw new NoSuchElementException();
		
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	
	public void print() {
		for (Node p = head; p!=null; p=p.getNext())
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
	
	public void mergeLists(Node p1, Node p2) {
		SList<Integer> newlist = new SList<Integer>();
		newlist.head = null;
		
		
		if(p1.getItem().compareTo(p2.getItem())>0) {
			newlist.head = p2;
			p2 = p2.getNext();
			
		}else {
			newlist.head = p1;
			p1 = p1.getNext();
		}
//		while (!newlist.isEmpty()) {
//			newlist.insertFront(newlist.head.getNext());
//		}
		newlist.print();
	}

		
		
	
	public void splitList(Node p,int k,SList l1, SList l2) {
		head = p;
		for (int u=0; u<size ; u++) {
			if (p.getItem().compareTo(20)>0) {
				l1.insertFront(p.getItem());
				p = p.getNext();
			}else {
				l2.insertFront(p.getItem());
				p=p.getNext();
			}
		}
		System.out.print("List1(>20):     " ); l1.print();
		System.out.print("List2(<=20):     " ); l2.print();

	}
	
}
