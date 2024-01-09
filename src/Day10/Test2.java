package Day10;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("202014889 김민상");
		while (true) {
			System.out.print("입력>> ");
			int n = scan.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
