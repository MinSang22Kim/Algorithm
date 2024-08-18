import java.util.Scanner;

public class Main {
	public static long gcd(long a, long b) {
		while(b!=0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			long a = scan.nextInt();
			long b = scan.nextInt();
			System.out.println(a * b / gcd(a, b));
		}
		scan.close();
	}

}
