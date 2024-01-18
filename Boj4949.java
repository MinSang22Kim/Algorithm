import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("."))
				break;

			boolean check = true;
			Stack<Character> stack = new Stack<Character>();

			for (int i = 0; i < line.length(); i++) {
				char a = Character.valueOf(line.charAt(i));
				if (a == '.')
					break;
				else if (a == '(')
					stack.push(a);
				else if (a == '[')
					stack.push(a);
				else if (a == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						check = false;
						break;
					}
					stack.pop(); // 짝맞는 경우 pop
				} else if (a == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						check = false;
						break;
					}
					stack.pop(); // 짝맞는 경우 pop
				}
			}
			// 짝안맞는 경우 남아있음 ex. ((]
			if (!stack.isEmpty())
				check = false;

			System.out.println(check ? "yes" : "no");
		}

	}
}
