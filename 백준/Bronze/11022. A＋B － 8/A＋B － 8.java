import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}

		for (int i = 0; i < num; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, a[i], b[i], a[i] + b[i]);
		}
	}

}