package Day3;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i < num) {
				System.out.print("+");
			} else if (i == num) {
				System.out.print("=");
				System.out.print(sum);
			} else
				break;
		}
		scan.close();
	}
}
