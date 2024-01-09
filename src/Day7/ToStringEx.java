package Day7;

class Point2 {
	private int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	public String toString() {
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	}

	// 이미 Object에 작성된 메소드를 오버라이딩해서 재작성
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");
	}
}
