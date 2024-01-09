package Day7;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = Integer.valueOf(10); // 오토 박싱을 명시적으로 표현
		System.out.println("intObject = " + intObject);

		int m = intObject.intValue() + 10; // 오토 언박싱을 명시적으로 표현
		System.out.println("m = " + m);
	}
}
