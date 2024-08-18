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

		int tcase = Integer.parseInt(br.readLine());
		for (int i = 0; i < tcase; i++) {
			int sum = 0;
			int s = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int q = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				sum += (q * p);
			}
			sum += s;
			bw.write(Integer.toString(sum) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
