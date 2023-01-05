//자료구조 과제 #9(60160478 주세현)

public class DoubleHashing <K, V>{
	private int N = 0;
	private int M = 13;
	private int crash_count = 0;
	private K[] a = (K[]) new Object[M];
	private V[] dt = (V[]) new Object[M];
	private int hash(K key) {
		return (key.hashCode() % 0x7fffffff) % M;
	}
	private void put (K key, V data) {
		int initialpos = hash(key);
		int i = initialpos;
		int j=1;
		int d= (7-(int)key %7);
		do {
			if(a[i]==null) {
				a[i] = key;
				dt[i] = data; N++;
				return;
			}else {
				crash_count = crash_count + 1;
				System.out.println(key+"를 "+i+"에 삽입할 때 충돌이 발생");
			}
			if(a[i].equals(key)) {
				dt[i] = data;
				return;
			}
			i = (initialpos + j*d)%M;
			j++;
			
			
		}while(N<M);
	}
	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos;
		int j =1;
		int d = (7-(int)key % 7);
		while (a[i]!=null) {
			if (a[i].equals(key))
				return dt[i];
			i = (initialpos + j*d)%M;
			j++;
		}
		return null;
	}
	public void getCrash() {System.out.println("충돌이 총 "+crash_count+"번 발생하였습니다.");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DoubleHashing");
		DoubleHashing dh = new DoubleHashing();
		dh.M = 11;
		dh.put(71, null);dh.put(23, null);dh.put(73, null);
		dh.put(49,null);dh.put(54, null);dh.put(89, null);
		dh.put(39, null);
		
		dh.getCrash();
	}

}
