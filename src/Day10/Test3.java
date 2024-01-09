package Day10;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("202014889 김민상");
		while (true) {
			System.out.print("입력>> ");
			int n = scan.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				int rand = random.nextInt(n);
				System.out.print(rand + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
