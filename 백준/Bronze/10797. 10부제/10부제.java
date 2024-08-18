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

		int cnt = 0;
		int day = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] car = new int[5];

		for (int i = 0; i < 5; i++) {
			car[i] = Integer.parseInt(st.nextToken());
			if (car[i] == day)
				cnt++;
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
