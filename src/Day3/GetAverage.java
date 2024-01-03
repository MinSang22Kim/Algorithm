package Day3;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0, sum = 0;
		double average = 0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = scan.nextInt();
		while (n != -1) {
			count++;
			sum += n;
			n = scan.nextInt();
		}
		average = (double) sum / count;

		System.out.printf("정수의 개수는 %d개이며 평균은 %f입니다.\n", count, average);
		scan.close();
	}
}
