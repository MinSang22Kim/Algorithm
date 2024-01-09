package Day9;

class GStack<T> {
	int tos; // tos가 5다 -> 0~4 저장 가능(사이즈)
	T[] stck;

	public GStack() {
		tos = 0;
		stck = (T[]) new Object[10]; // 원소 10개로 스택 선언
	}

	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}

	public T pop() {
		if (tos == 0)
			return null;
		tos--;
		return stck[tos];
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		GStack<Integer> intStack = new GStack<Integer>();

		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");

		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}

		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());
		}
	}
}
