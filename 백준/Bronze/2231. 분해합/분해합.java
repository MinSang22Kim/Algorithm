import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int ans = 0;

		for (int i = 0; i < N; i++) {
			int sum = i, num = i;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}

			if (sum == N) {
				ans = i;
				break;
			}
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
