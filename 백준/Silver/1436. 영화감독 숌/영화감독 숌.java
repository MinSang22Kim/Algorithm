import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int cnt = 0;
		int num = 0;
		int N = Integer.parseInt(br.readLine());

		while (N != cnt) {
			num++;
			String s = Integer.toString(num);
			if (s.contains("666"))
				cnt++;
		}

		bw.write(Integer.toString(num));
		bw.flush();
		bw.close();
	}
}
