import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int money = Integer.parseInt(br.readLine());

			sb.append(money / 25 + " ");
			money %= 25;

			sb.append(money / 10 + " ");
			money %= 10;

			sb.append(money / 5 + " ");
			money %= 5;

			sb.append(money / 1 + "\n");
		}
		System.out.println(sb);
	}
}