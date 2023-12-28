package Day3;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개? ");
		int num = scan.nextInt();
		int arr[] = new int[num];
		for (int i = 1; i <= num; i++) {
			if (i % 11 == 0) {
				System.out.println();
			}
			arr[i - 1] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i - 1] + " ");

		}

		scan.close();
	}
}
