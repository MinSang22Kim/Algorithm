import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		String s = scan.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char input = s.charAt(i);
			switch (input) {
			case '<':
				while (!stack.isEmpty())
					sb.append(stack.pop());
				while (!(input == '>')) {
					sb.append(input);
					input = s.charAt(++i);
				}
				sb.append(input); // '>'저장하고 마무리
				break;
			case ' ':
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(' ');
				break;
			default:
				stack.push(input);
				break;
			}
		}

		while (!stack.isEmpty())
			sb.append(stack.pop());

		System.out.println(sb);
		scan.close();
	}
}
