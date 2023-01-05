//자료구조 과제 #8(60160478 주세현)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry []a = new Entry[10];
//		a[1] = new Entry(80,null);
//		a[2] = new Entry(40,null);
//		a[3] = new Entry(70,null);
//		a[4] = new Entry(30,null);
//		a[5] = new Entry(60,null);
//		a[6] = new Entry(20,null);
//		a[7] = new Entry(50,null);
//		a[8] = new Entry(10,null);
		
		BHeap h = new BHeap(a,0); 
		h.createHeap();
		
		h.insert(80, null);h.print();
		h.insert(40, null);h.print();
		h.insert(70, null);h.print();
		h.insert(30, null);h.print();
		h.insert(60, null);h.print();
		h.insert(20, null);h.print();
		h.insert(50, null);h.print();
		h.insert(10, null);h.print();

		
//		System.out.println(h.deletemin().getKey());
//		h.insert(5, null);
		
	}

}
