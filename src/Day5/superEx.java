package Day5;

class Point2 {
	private int x, y;

	public Point2() {
		this.x = this.y = 0;
	}

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint2() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

class ColorPoint2 extends Point2 {
	private String color;

	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showColorPoint2() {
		System.out.print(color);
		showPoint2();
	}
}

public class superEx {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
		cp.showColorPoint2();
	}
}
