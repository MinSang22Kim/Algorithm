import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀함수로 풀면 시간초과 발생
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0, n1 = 0, n2 = 1;

		if (N == 1)sum = 1;
		
		for (int i = 2; i <= N; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		System.out.println(sum);
	}
}
