package PostfixCalculatorAssignment;

import java.util.Scanner;
import java.util.Stack;

public class PostFixCalculator {
	public static int calculate(int n1, String op, int n2) {
		switch (op) {
		case "+":
			return n1 + n2;
		case "-":
			return n1 - n2;
		case "*":
			return n1 * n2;
		case "/":
			if (n2 != 0)
				return n1 / n2;
			else
				throw new ArithmeticException("오류) 0으로 나눌 수 없음!!");
		default:
			throw new IllegalArgumentException("오류) 제공하지 않는 연산자: " + op);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();

		System.out.print("Input string: ");
		String[] input = scan.nextLine().split(" ");

		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {
			case "+":
			case "-":
			case "*":
			case "/":
				int second = Integer.parseInt(stack.pop());
				int first = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(calculate(first, input[i], second)));
				break;
			default:
				stack.push(input[i]);
				break;
			}
		}

		if (stack.size() == 1)
			System.out.print("Answer: " + stack.pop());
		else
			System.out.println("올바른 후위표기식을 입력하시오!");

		scan.close();
	}
}
