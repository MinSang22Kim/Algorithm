import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int bee(int n) {
		int cnt = 1;
		if (n == 1)
			return cnt;
		else {
			while (n > 1) {
				n -= (6 * cnt);
				cnt++;
			}
			return cnt;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(Integer.toString(bee(N)));
		bw.flush();
		bw.close();
	}
}
