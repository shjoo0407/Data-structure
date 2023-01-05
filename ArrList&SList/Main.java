//자료구조 과제#2 (60160478 주세현)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SList<String> s = new SList<String>();
		s.insertFront("orange");s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(":S의 길이 = "+s.size()+"\n");
		System.out.println("체리가 \t" + s.search("cherry")+"번째에 있다.");
		System.out.println("키위가 \t" + s.search("kiwi")+"번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이 = "+s.size());System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이 = "+s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = "+t.size());
		
		System.out.println("---------------------------------");
		
		
		SList<Integer> list1 = new SList<Integer>();
		SList<Integer> list2 = new SList<Integer>();
		
		list1.insertFront(50);
		list1.insertFront(40);
		list1.insertFront(30);
		list1.insertFront(20);
		list1.insertFront(10);

		list2.insertFront(55);
		list2.insertFront(37);
		list2.insertFront(35);
		list2.insertFront(18);
		list2.insertFront(15);

		System.out.print("Sorted List1:    ");list1.print();
		System.out.print("Sorted List2:    ");list2.print();
		System.out.println("Merged List:    ");	list1.mergeLists(list1.head, list2.head);
		
		
		System.out.println("=========================");
		SList<Integer> list3 = new SList<Integer>();
		list3.insertFront(45);
		list3.insertFront(17);
		list3.insertFront(20);
		list3.insertFront(50);
		list3.insertFront(57);
		list3.insertFront(35);
		list3.insertFront(10);
		list3.insertFront(15);
		list3.insertFront(90);
		list3.insertFront(10);
		list3.print();
		
		SList<Integer> over20 = new SList<Integer>();
		SList<Integer> under20 = new SList<Integer>();
		list3.splitList(list3.head, 20, over20, under20);
		
		
		
		
	}

}
