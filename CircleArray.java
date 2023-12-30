package Day4;

import java.util.Scanner;

class Circle2 {
	int radius;

	public Circle2(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * Math.pow(radius, 2);
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle2[] c;
		c = new Circle2[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle2(i); // i가곧 반지름
		}
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%d번째 원의 면적: %2d\n", i + 1, (int) c[i].getArea());
		}
		scan.close();
	}
}
