import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		while (N > 0) {
			int tmp = N % B;
			if (tmp < 10)
				sb.append(tmp);
			else
				sb.append((char) (tmp + 'A' - 10));
			N /= B;
		}

		bw.write(sb.reverse().toString());
		bw.flush();
		bw.close();
	}
}
