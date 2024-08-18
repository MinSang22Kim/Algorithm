import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int cycle(int num) {
		int cnt = 0;
		int original = num;

		do {
			num = ((num % 10) * 10) + ((num / 10 + num % 10)) % 10;
			cnt++;
		} while (original != num);

		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(Integer.toString(cycle(N)));
		bw.flush();
		bw.close();
	}
}