import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		long[] dp = new long[n + 1];

		dp[1] = score[1];
		if (n >= 2)
			dp[2] = score[1] + score[2];
		if (n >= 3)
			dp[3] = Math.max(score[1], score[2]) + score[3];

		for (int i = 4; i <= n; i++) {
			dp[i] = Math.max(dp[i - 3] + score[i - 1], dp[i - 2]) + score[i];
		}

		bw.write(Long.toString(dp[n]));
		bw.flush();
		bw.close();
		br.close();
	}
}
