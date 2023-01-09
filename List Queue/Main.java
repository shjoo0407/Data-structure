
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<String> s = new ListQueue<String>();
		s.add("apple");
		s.add("orange");
		s.add("cherry");
		s.add("pear");
		s.print();
		s.remove();s.print();
		s.remove();s.print();
		s.add("grape");s.print();
		
	}

}
