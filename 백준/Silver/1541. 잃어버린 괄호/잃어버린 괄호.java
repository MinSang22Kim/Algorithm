import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int ans = 0;
		String[] sub = br.readLine().split("-");

		for (int i = 0; i < sub.length; i++) {
			int temp = 0;
			String[] add = sub[i].split("\\+");
			
			for (int j = 0; j < add.length; j++) {
				temp += Integer.parseInt(add[j]);
			}
			
			if (i == 0)ans += temp;
			else ans -= temp;
		}

		bw.write(Integer.toString(ans));
		bw.flush();
		bw.close();
	}
}
