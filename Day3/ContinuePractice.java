package Day3;

import java.util.Scanner;

// 양수의 합만 더하여 출력하는 프로그램
public class ContinuePractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			if (num >= 0) {
				sum += i;
			} else {
				continue;
			}
		}
		System.out.printf("양수의 합은 %d\n", sum);
		scan.close();
	}
}
