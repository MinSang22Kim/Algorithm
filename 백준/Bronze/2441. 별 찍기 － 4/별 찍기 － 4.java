import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < num-i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
