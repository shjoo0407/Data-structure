
//자료구조 과제 #4 (60160478 주세현)
import java.util.*;

public class Main {
	public static int rank(char c) {
		switch(c) {
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		case '(':
		case ')':
			return 0;
		}
		return -1;
	}
	
	public static void test(String str) {
		ListStack<Character> stack = new ListStack<Character>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			int p=rank(str.charAt(i));
			
			switch(str.charAt(i)) {
			case '+':
			case '-':
			case '*':
			case '/':
				while(!stack.isEmpty()&& rank(stack.peek())>= p) {
					sb.append(stack.pop());
				}
				stack.push(str.charAt(i));
				break;
			case '(':
				stack.push(str.charAt(i));
				break;
			case ')':
				while (!stack.isEmpty()&&stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
				break;
				default:
					sb.append(str.charAt(i));
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("A-B+C/D");
		test("A/B-C*D");
		test("A-B*C+D/E-F");
		test("(A-B)*C-(D/(E+F))");
		

	}
}
	
	
	



