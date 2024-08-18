import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] basket = new int[N];

		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int b1 = scan.nextInt() - 1;
			int b2 = scan.nextInt() - 1;
			int temp = basket[b1];
			basket[b1] = basket[b2];
			basket[b2] = temp;
		}

		for (int i = 0; i < N; i++)
			System.out.print(basket[i] + " ");
		scan.close();
	}
}