package Day10;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("202014889 김민상");
		while (true) {
			System.out.print("입력>> ");

			int n = scan.nextInt();
			int[] num = new int[n];
			int[] cnt = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = i;
				cnt[i] = 0;
			}
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				int rand = random.nextInt(n);
				System.out.print(rand + " ");
				for (int j = 0; j < n; j++) {
					if (num[j] == rand)
						cnt[j]++;
				}
			}
			System.out.println();
			for (int i = 0; i < n; i++) {
				System.out.print(i + "(" + cnt[i] + ")" + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
