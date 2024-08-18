import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cute = 0, not = 0;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input == 1)
				cute++;
			else if (input == 0)
				not++;
		}

		bw.write(cute > not ? "Junhee is cute!" : "Junhee is not cute!");
		bw.flush();
		bw.close();
	}
}
