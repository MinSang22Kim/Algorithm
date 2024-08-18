import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		System.out.println("int a;");
		System.out.println("int *ptr = &a;");
		for (int i = 2; i <= N; i++) {

			sb.append("int ");

			for (int j = 0; j < i; j++) {
				sb.append("*");
			}

			sb.append("ptr" + i + " = " + "&ptr" + ((i == 2) ? "" : (i - 1)) + ";\n");
			System.out.print(sb);

			sb.setLength(0);
		}
	}
}
