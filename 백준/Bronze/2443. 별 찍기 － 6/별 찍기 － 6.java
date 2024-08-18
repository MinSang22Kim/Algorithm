import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * n - (2 * i - 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
