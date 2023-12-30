package Day4;

class Sample {
	public int a;
	// private int b;
	int c;
}

public class AccessModifier {
	public static void main(String[] args) {
		Sample sp = new Sample();
		sp.a = 10;
		// sp.b = 20;
		// private이므로 다른 클래스 접근 불가
		sp.c = 30;
	}
}
