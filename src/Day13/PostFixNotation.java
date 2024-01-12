package Day13;

import java.util.Scanner;

public class PostFixNotation {
	// 연산자 우선순위
	public static int priority(char operator) {
		if (operator == '(' || operator == ')')
			return 0;
		if (operator == '+' || operator == '-')
			return 1;
		if (operator == '*' || operator == '/')
			return 2;
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		LinkedStack<Character> stack = new LinkedStack<>();

		System.out.print("Input infix expression>> ");
		String word = scan.nextLine();

		for (int i = 0; i < word.length(); i++) {
			char now = word.charAt(i);
			switch (now) {
			case '+':
			case '-':
			case '*':
			case '/':

				stack.push(now);
				break;
			default:
				sb.append(now);
				break;
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.print("postfix expression: ");
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.toString());
		}
		scan.close();
	}
}

//            while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
//                sb.append(stack.pop());
//            }
//            stack.add(now);
//            break;
//        case '(':
//            stack.add(now);
//            break;
//        case ')':
//            while(!stack.isEmpty() && stack.peek() != '('){
//                sb.append(stack.pop());
//            }
//            stack.pop();
//            break;
//        default:
//            sb.append(now);
//    }
//}
//
//while (!stack.isEmpty()) {
//    sb.append(stack.pop());
//}
//
//System.out.println(sb.toString());
//}