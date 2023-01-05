//자료구조 과제 #9(60160478 주세현)

public class QuadProbing <K,V>{
	private int N = 0;
	private int M = 13;
	private int crash_count = 0;
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];
	private int hash(K key) {
		return (key.hashCode() % 0x7fffffff) % M;
	}
	private void put(K key, V data) {
		int initialpos = hash(key);
		int i = initialpos, j=1;
		do {
			if (a[i]==null) {
				a[i] = key;
				d[i] = data; N++;
				return;
			}else {
				crash_count = crash_count + 1;
				System.out.println(key+"를 "+i+"에 삽입할 때 충돌이 발생");
			}
			if (a[i].equals(key)) {
				d[i] = data;
				return;
			}
			i = (initialpos + j * j++)%M;
			

		}while (N < M);
	}
	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j=1;
		while(a[i]!=null) {
			if(a[i].equals(key))
				return d[i];
			i = (initialpos + j * j++)%M;
		}
		return null;
	}
	public void getCrash() {System.out.println("충돌이 총 "+crash_count+"번 발생하였습니다.");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("QuadProbing");
		QuadProbing qp = new QuadProbing();
		qp.M = 11;
		qp.put(71, null);qp.put(23, null);qp.put(73, null);
		qp.put(49,null);qp.put(54, null);qp.put(89, null);
		qp.put(39, null);
		
		qp.getCrash();
	}
}



