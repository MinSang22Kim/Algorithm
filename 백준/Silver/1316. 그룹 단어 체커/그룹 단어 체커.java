import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean groupWordChecker(String str) {
		boolean[] alphabet = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			int prev = i > 0 ? str.charAt(i - 1) : 0;
			// boolean 배열의 초기값은 false다. (빈 경우)
			if (alphabet[now - 'a'] == false)
				alphabet[now - 'a'] = true;
			// 뭔가 들어있을 땐 이전 것과 같은지 비교
			// 이전 것과 같지 않다면 그전에 넣어진 것(aaza)
			else if (now != prev)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (groupWordChecker(s))
				answer++;
		}
		System.out.println(answer);
	}
}
