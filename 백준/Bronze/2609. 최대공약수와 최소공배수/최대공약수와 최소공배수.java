import java.util.Scanner;

public class Main {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	} // gcd(a,b) = gcd(b,r)...

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int d = gcd(a, b); // 최대공약수
		System.out.println(d);
		System.out.println(a * b / d); // 최대공배수

		scan.close();
	}
}