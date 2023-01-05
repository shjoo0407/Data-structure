//자료구조 과제 #1 (60160478 주세현)

import java.util.*;
public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원판의 개수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int plate = scanner.nextInt();
		
		Hanoi hanoi  = new Hanoi();
		hanoi.move("A", "B", "C", plate);
		
		
	}
	public static void move(String from, String mid,String to,int plate) {
		if(plate==1) {
			System.out.println("원판 "+ plate + "를 "+ from + "에서 " + to+"로 이동");
		}else {
			move(from,to,mid,plate-1);
			System.out.println("원판 "+ plate + "를 "+ from + "에서 " + to+"로 이동");
			move(mid,from,to,plate-1);
		}
	}
		

}
