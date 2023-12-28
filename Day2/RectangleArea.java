package Day2;

// 직사각형의 넓이를 구하는 프로그램
import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int height = scan.nextInt();
		System.out.println(width * height);
		scan.close();
	}
}
