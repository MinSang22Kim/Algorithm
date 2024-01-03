package Day3;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		System.out.print("5개의 정수를 입력하세요>> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.printf("평균은 %f입니다\n", (double) sum / arr.length);
		scan.close();
	}
}
