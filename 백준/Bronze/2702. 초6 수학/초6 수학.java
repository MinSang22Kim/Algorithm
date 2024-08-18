import java.util.Scanner;

public class Main {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.printf("%d %d\n", a * b / gcd(a, b), gcd(a, b));
		}
		scan.close();
	}
}
