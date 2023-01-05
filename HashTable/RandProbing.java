//자료구조 과제 #9(60160478 주세현)

import java.util.Random;
public class RandProbing<K,V> {
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
		int i = initialpos;
		Random rand = new Random();
		rand.setSeed(10);
		do {
			if(a[i]==null) {
				a[i] = key;
				d[i] = data;N++;
				return;
			}else {
				crash_count = crash_count + 1;
				System.out.println(key+"를 "+i+"에 삽입할 때 충돌이 발생");
			}
			if(a[i].equals(key)) {
				d[i] = data;
				return;
			}
			i = (initialpos + rand.nextInt(1000) % M);
			
		}while(N<M);
	}
	public V get(K key) {
		Random rand = new Random();
		rand.setSeed(10);
		int initialpos = hash(key);
		int i = initialpos;
		while(a[i]!=null) {
			if (a[i].equals(key))
				return d[i];
			i = (initialpos + rand.nextInt(1000) % M);
		}
		return null;
	}
	public void getCrash() {System.out.println("충돌이 총 "+crash_count+"번 발생하였습니다.");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("RandProbing");
		RandProbing rp = new RandProbing();
		rp.M = 11;
		rp.put(71, null);rp.put(23, null);rp.put(73, null);
		rp.put(49,null);rp.put(54, null);rp.put(89, null);
		rp.put(39, null);
		
		rp.getCrash();
	}
}

