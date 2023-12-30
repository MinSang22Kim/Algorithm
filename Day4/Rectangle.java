package Day4;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		System.out.println("사각형의 면적: " + rect.getArea());
		scan.close();
	}
}
