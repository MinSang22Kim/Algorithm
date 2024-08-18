import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 1, cnt = 1; // 시작은 둘 다 1인덱스를 가리킴, 자기자신의 경우 1을 count
		int start_index = 1, end_index = 1;
		int N = Integer.parseInt(br.readLine());

		while (end_index != N) {
			if (sum == N) {
				cnt++;
				end_index++;
				sum += end_index;
			} else if (sum > N) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(cnt);
	}
}
