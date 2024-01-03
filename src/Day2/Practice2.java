package Day2;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int area, ax, ay;
		System.out.print("첫 번째 사각형의 두 모서리 (xl1, yl1)과 (xr1, yr1)을 입력하시오 >> ");
		int xl1 = scan.nextInt();
		int yl1 = scan.nextInt();
		int xr1 = scan.nextInt();
		int yr1 = scan.nextInt();

		System.out.print("첫 번째 사각형의 두 모서리 (xl2, yl2)과 (xr2, yr2)을 입력하시오 >> ");
		int xl2 = scan.nextInt();
		int yl2 = scan.nextInt();
		int xr2 = scan.nextInt();
		int yr2 = scan.nextInt();

		if (xl1 < xl2) {
			ax = xr1 - xl2;
		} else {
			ax = xr1 - xl2;
		}

		if (yr1 < yr2) {
			ay = yr1 - yl2;
		} else {
			ay = yr2 - yl1;
		}

		area = ax * ay;
		System.out.printf("두 사각형이 겹치는 영역의 넓이는 %d 입니다.", area);
		scan.close();
	}

	// 안겹치는경우 겹치는경우 들어가있는경
	// 0 0 1 1
	// 3 3 4 4
}
