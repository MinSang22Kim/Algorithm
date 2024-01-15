package Day14;

import Day13.LinkedStack;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Palindrome Check!");
//		String str = "kkookk";
//		String str = "alignngila";
		String str = "lioninoil";
		boolean t = isPalindrome(str);
		System.out.println("Is " + str + " Palindrome?: " + t);
	}

	// 하나는 큐에 넣고, 하나는 스택에 넣어서 출력이 같으면 펠린드롬
	private static boolean isPalindrome(String A) {
		LinkedStack<Character> s = new LinkedStack<>();
		LinkedQueue<Character> q = new LinkedQueue<>();
		for (int i = 0; i < A.length(); i++) {
			s.push(A.charAt(i));
			q.enqueue(A.charAt(i));
		}
		while (!q.isEmpty() && s.pop() == q.dequeue()) {

		}
		return q.isEmpty();
	}
}