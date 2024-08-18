import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		Set<Integer> card = new HashSet<>();
		// int[] card = new int[N];
		for (int i = 0; i < N; i++) {
			card.add(scan.nextInt());
		}

		int M = scan.nextInt();
		int[] check = new int[M];
		for (int i = 0; i < M; i++) {
			check[i] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			if (card.contains(check[i]))
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
		scan.close();
	}
}
