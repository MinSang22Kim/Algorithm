package Day10;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 첫 번째 사각형 입력 받기
		System.out.print("첫 번째 사각형의 두 모서리 (xl1, yl1)과 (xr1, yr1)을 입력하시오 >> ");
		int xl1 = scan.nextInt();
		int yl1 = scan.nextInt();
		int xr1 = scan.nextInt();
		int yr1 = scan.nextInt();

		// 두 번째 사각형 입력 받기
		System.out.print("두 번째 사각형의 두 모서리 (xl2, yl2)과 (xr2, yr2)을 입력하시오 >> ");
		int xl2 = scan.nextInt();
		int yl2 = scan.nextInt();
		int xr2 = scan.nextInt();
		int yr2 = scan.nextInt();

		// 겹치는 영역의 넓이 계산
		int overlapArea = calculateOverlapArea(xl1, yl1, xr1, yr1, xl2, yl2, xr2, yr2);

		// 결과 출력
		System.out.println("두 사각형이 겹치는 영역의 넓이는 " + overlapArea + " 입니다.");

		scan.close();
	}

	// 겹치는 영역의 넓이를 계산하는 메서드
	private static int calculateOverlapArea(int xl1, int yl1, int xr1, int yr1, int xl2, int yl2, int xr2, int yr2) {
		// 겹치는 영역의 좌표 계산
		int xOverlap = Math.max(0, Math.min(xr1, xr2) - Math.max(xl1, xl2));
		int yOverlap = Math.max(0, Math.min(yr1, yr2) - Math.max(yl1, yl2));

		// 겹치는 영역의 넓이 계산
		return xOverlap * yOverlap;
	}
}
