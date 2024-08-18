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
			int n1 = scan.nextInt() - 1;
			int n2 = scan.nextInt() - 1;
			while (n1 < n2) {
				int temp = basket[n2];
				basket[n2--] = basket[n1];
				basket[n1++] = temp;
			}
		}
		for (int k : basket) {
			System.out.print(k + " ");
		}
		scan.close();
	}
}
