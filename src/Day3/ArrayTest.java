package Day3;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요");
		for (int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.printf("가장 큰 수는 %d입니다.\n", max);
		scan.close();
	}
}
