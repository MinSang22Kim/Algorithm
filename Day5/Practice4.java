package Day5;

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.printf("(%d, %d)에서 크기가 %dx%d인 사각형\n", x, y, width, height);

	}

	public boolean contains(Rectangle r) {
		// r이 현재의 사각형 안에 있으면 true 반환
//		if (this.x <= r.x && r.y <= this.y) {
//			if (r.x + r.width <= this.x + this.width && r.y + r.height <= this.y + this.height) {
//				return true;
//			}
//		}
		if (x < r.x && y < r.y)
			if ((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height))
				return true;
		return false;
	}
}

public class Practice4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s을 포함합니다.");

	}

}
