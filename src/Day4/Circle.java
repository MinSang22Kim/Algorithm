package Day4;

public class Circle {
	int radius; // 원의 필드(반지름, 이름)
	String name;

	public Circle() {
	} // 원의 생성자

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut;
		donut = new Circle();
		donut.radius = 8;
		donut.name = "글레이즈드도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
