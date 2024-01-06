package Day5;

import java.util.Scanner;

class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

class ColorPoint extends Point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		Point p = new Point();

		p.set(x, y);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(x, y);
		cp.setColor("red");
		cp.showColorPoint();

		scan.close();
	}
}
