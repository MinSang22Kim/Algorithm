package Day3;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d ", i, j, i * j);
				System.out.print("\t");
			}
			System.out.println();
		}
		scan.close();
	}
}
