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

		int[] arr = new int[5];
		int index = 1, max = 0;

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int score = 0;
			for (int j = 0; j < 4; j++) {
				score += Integer.parseInt(st.nextToken());
			}
			arr[i] = score;
			if (score > max) {
				max = score;
				index = i + 1;
			}
		}

		bw.write(Integer.toString(index) + " " + Integer.toString(max));
		bw.flush();
		bw.close();
	}
}
