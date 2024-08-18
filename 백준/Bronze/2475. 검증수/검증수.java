import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int tmp = scan.nextInt();
			sum += Math.pow(tmp, 2);
		}
		scan.close();
		System.out.println(sum % 10);
	}
}
