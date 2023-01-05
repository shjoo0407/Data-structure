//자료구조 과제 #9(60160478 주세현)

public class Chaining <K, V>{
	private int M = 13;
	private int crash_count = 0;
	private Node[] a = new Node[M];
	public static class Node{
		private Object key;
		private Object data;
		private Node next;
		public Node(Object newKey, Object newData, Node ref) {
			key = newKey;
			data = newData;
			next= ref;
		}
		public Object getKey() {return key;}
		public Object getData() {return data;}
	}
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff)%M;}
	
	public V get(K key) {
		int i = hash(key);
		for (Node x = a[i]; x!= null; x = x.next)
			if (key.equals(x.key))return (V) x.data;
		return null;
	}
	
	private void put(K key, V data) {
		int i = hash(key);
		for (Node x = a[i]; x!= null; x= x.next)
			if(key.equals(x.key)) {
				x.data = data;
				return;
			}
			if(a[i]!=null) {
				crash_count = crash_count + 1;
				System.out.println(key+"를 "+i+"에 삽입할 때 충돌이 발생");
				}

		a[i] = new Node(key, data, a[i]);
}
	public void getCrash() {System.out.println("충돌이 총 "+crash_count+"번 발생하였습니다.");}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chaining");
		Chaining c = new Chaining();
		c.M = 11;
		c.put(71, "grape");c.put(23, "banana");c.put(73, "apple");
		c.put(49,"lemon");c.put(54, "kiwi");c.put(89, "lime");
		c.put(39, "orange");
		
		c.getCrash();


	}

}
