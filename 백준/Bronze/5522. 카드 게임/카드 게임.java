import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score, sum = 0;
		for (int i = 0; i < 5; i++) {
			score = Integer.parseInt(br.readLine());
			sum += score;
		}
		System.out.println(sum);
	}
}
