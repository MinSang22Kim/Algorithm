import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		double[] arr = new double[N];
		Stack<Double> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}

		for (int i = 0; i < input.length(); i++) {
			char now = input.charAt(i);
			// 피연산자
			if ('A' <= now && now <= 'Z') {
				stack.push(arr[now - 'A']);
			} else {
				double n1 = stack.pop();
				double n2 = stack.pop();
				// 연산자
				switch (now) {
				case '+':
					stack.push(n2 + n1);
					break;
				case '-':
					stack.push(n2 - n1);
					break;
				case '*':
					stack.push(n2 * n1);
					break;
				case '/':
					if (n1 == 0) {
						System.out.println("Error");
						return;
					}
					stack.push(n2 / n1);
					break;
				}
			}
		}
		System.out.printf("%.2f\n", stack.pop());
		br.close();
	}
}