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

		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(Integer.toString((arr[2] * arr[4] - arr[1] * arr[5]) / (arr[0] * arr[4] - arr[1] * arr[3])) + " ");
		bw.write(Integer.toString((arr[0] * arr[5] - arr[3] * arr[2]) / (arr[0] * arr[4] - arr[1] * arr[3])));
		bw.flush();
		bw.close();
	}
}
