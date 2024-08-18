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

		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

		int check = 0;
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;

		for (int i = 0; i < x; i++) {
			check += month[i];
		}

		check = (check + y) % 7;

		bw.write(day[check]);
		bw.flush();
		bw.close();
	}
}
