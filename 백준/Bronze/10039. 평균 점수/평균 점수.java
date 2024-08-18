import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] = (arr[i] < 40) ? 40 : arr[i];
			sum += arr[i];
		}

		bw.write(Integer.toString(sum / 5));
		bw.flush();
		bw.close();

	}
}