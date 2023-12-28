package Day2;

// 원의 면적을 계산하는 프로그램
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final double PI = 3.14;
		double radius = scan.nextDouble();
		System.out.println(PI * radius * radius);

		scan.close();
	}
}
