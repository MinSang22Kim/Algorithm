import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scan.nextInt();
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < N; i++) {
			String command = scan.next();
			switch (command) {
			case "push":
				s.push(scan.nextInt());
				break;
			case "pop":
				if (!s.isEmpty())
					sb.append(s.pop()).append("\n");
				else
					sb.append(-1).append("\n");
				break;
			case "size":
				sb.append(s.size()).append("\n");
				break;
			case "empty":
				if (s.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
			case "top":
				if (!s.isEmpty())
					sb.append(s.peek()).append("\n");
				else
					sb.append(-1).append("\n");
				break;
			default:
				System.out.println("잘못된 명령어입니다!");
				break;
			}
		}
		System.out.println(sb);
		scan.close();
	}
}
