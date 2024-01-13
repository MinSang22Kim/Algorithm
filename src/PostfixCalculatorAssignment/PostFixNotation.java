package PostfixCalculatorAssignment;

import java.util.Scanner;
import java.util.Stack;

public class PostFixNotation {
	// 연산자 우선순위
	public static int priority(char operator) {
		if (operator == '(' || operator == ')')
			return 0;
		else if (operator == '+' || operator == '-')
			return 1;
		else if (operator == '*' || operator == '/')
			return 2;
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		System.out.print("Input infix expression>> ");
		String word = scan.nextLine();

		System.out.print("postfix expression: ");
		for (int i = 0; i < word.length(); i++) {
			char now = word.charAt(i);
			switch (now) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!stack.isEmpty() && priority(stack.peek()) > priority(now)) {
					System.out.print(stack.pop() + " ");
				}
				stack.push(now);
				break;
			case '(':
				stack.push(now);
				break;
			case ')':
				while (!stack.isEmpty() && stack.peek() != '(')
					System.out.print(stack.pop() + " ");
				stack.pop(); // '(' 제거
				break;
			default: // 피연산자는 그냥 출력
				System.out.print(now + " ");
				break;
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

		scan.close();
	}
}
