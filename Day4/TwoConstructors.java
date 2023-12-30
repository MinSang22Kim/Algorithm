package Day4;

public class TwoConstructors {
	int radius;
	String name;

	public TwoConstructors() { // 매개 변수 없는 생성자
		radius = 1;
		name = ""; // radius의 초기값은 1
	}

	public TwoConstructors(int r, String n) { // 매개 변수를 가진 생성자
		radius = r;
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		TwoConstructors pizza = new TwoConstructors(10, "자바피자"); // Circle 객체 생성, 반지름 10

		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		TwoConstructors donut = new TwoConstructors(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
