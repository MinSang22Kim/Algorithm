import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] arr = new int[N];
		int start, end, ball;

		for (int i = 0; i < M; i++) {
			start = scan.nextInt() - 1;
			end = scan.nextInt() - 1;
			ball = scan.nextInt();
			for (int j = start; j <= end; j++) {
				arr[j] = ball;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
