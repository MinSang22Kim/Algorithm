package Day5;

class Person {
	private int weight;
	private int age;
	private int height;
	public String name;

	public Person() {

	}

	public Person(int weight, int age, int height, String name) {
		this.weight = weight;
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public void set(int weight, int age, int height, String name) {
		this.weight = weight;
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public void get() {
		System.out.printf("이 사람의 몸무게, 나이, 키, 이름은 %d, %d, %d, %s입니다.\n", weight, age, height, name);
	}
}

class Student extends Person {
	public Student(int weight, int age, int height, String name) {
		super(weight, age, height, name);
		System.out.printf("이 학생의 몸무게, 나이, 키, 이름은 %d, %d, %d, %s입니다!\n", weight, age, height, name);
	}
}

public class inheritanceEx {
	public static void main(String[] args) {
		Student s = new Student(99, 30, 175, "홍길동");
		s.get();
	}
}
