import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] arr = new long[101];

		arr[1] = arr[2] = arr[3] = 1;
		arr[4] = arr[5] = 2;

		for (int i = 6; i <= 100; i++) {
			arr[i] = arr[i - 5] + arr[i - 1];
		}
		int tcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < tcase; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(Long.toString(arr[n]) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
