package Day6;

class A {
	private int a;

//	protected A(int i) {
//		a = i;
//	}
}

class B extends A {
	private int b;

	public B() {
		b = 0;
	}
}

public class Example {
	public static void main(String[] args) {
		B b1 = new B();
		// B b2 = new B(11);
	}
}
