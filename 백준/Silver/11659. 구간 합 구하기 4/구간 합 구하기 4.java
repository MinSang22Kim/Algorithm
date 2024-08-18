import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 수의 개수
		int M = scan.nextInt(); // 합 구해야 하는 횟수
		long[] sumArr = new long[N + 1];

		for (int i = 1; i <= N; i++) {
			sumArr[i] = sumArr[i - 1] + scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println(sumArr[end] - sumArr[start - 1]);
		}

		scan.close();
	}
}
