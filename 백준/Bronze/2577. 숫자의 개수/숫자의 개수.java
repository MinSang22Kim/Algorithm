import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		String multiple = String.valueOf(A * B * C);
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < multiple.length(); j++) {
				if ((multiple.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
