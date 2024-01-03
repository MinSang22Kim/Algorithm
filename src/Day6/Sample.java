package Day6;

class SuperObject {
	public void paint() {
		draw();
	}

	public void draw() {
		draw(); // this.draw()
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	@Override
	public void paint() {
		super.draw();
	}

	@Override
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class Sample {
	public static void main(String[] args) {
		// b 변수는 SuperObject 타입으로 선언되었지만 실제로는 SubObject의 객체를 참조할 수 있
		SuperObject b = new SubObject();
		b.paint();
	}

}
