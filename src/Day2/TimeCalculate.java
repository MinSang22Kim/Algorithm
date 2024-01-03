package Day2;
// 초단위를 입력받아 시, 분, 초 구분하여 출력하는 프로그램

import java.util.Scanner;

public class TimeCalculate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초단위 시간을 입력: ");
		int time = scan.nextInt();

		int second = time % 60;
		int hour = time / 3600;
		int minute = time / 60 % 60;

		System.out.println(hour + "시 " + minute + "분 " + second + "초 입니다.");
		scan.close();
	}
}
