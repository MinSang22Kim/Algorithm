import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = scan.nextInt();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			int command = scan.nextInt();

			switch (command) {
			case 1:
				int x = scan.nextInt();
				stack.push(x);
				break;
			case 2:
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			case 3:
				sb.append(stack.size()).append("\n");
				break;
			case 4:
				if (stack.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
			case 5:
				if (!stack.isEmpty())
					sb.append(stack.peek()).append("\n");
				else
					sb.append(-1).append("\n");
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
		scan.close();
	}
}
