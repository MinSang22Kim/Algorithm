import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int calc(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
			result %= 10;
		}
		return result == 0 ? 10 : result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tcase = Integer.parseInt(br.readLine());
		for (int i = 0; i < tcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(calc(a, b)) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
