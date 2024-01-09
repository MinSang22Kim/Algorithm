package Day10;

import java.util.Scanner;

public class CIrcleArea {
	public static void main(String[] args) {
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		double r1 = scan.nextDouble();

		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double r2 = scan.nextDouble();
		double distance = Math.sqrt((x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2));
		if (distance <= r1 + r2) {
			System.out.print("두 원은 서로 겹친다.");
		} else {
			System.out.print("두 원은 서로 겹치지 않는다.");
		}
		scan.close();
	}
}
