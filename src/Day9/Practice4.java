package Day9;

import java.util.Vector;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack2<T> implements IStack<T> {
	private Vector<T> stack;

	public MyStack2() {
		stack = new Vector<T>();
	}

	@Override
	public T pop() {
		if (stack.isEmpty()) {
			return null;
		}
		T item = stack.remove(stack.size() - 1);
		return item;
	}

	@Override
	public boolean push(T ob) {
		stack.add(ob);
		return true;
	}
}

public class Practice4 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack2<Integer>();
		for (int i = 0; i < 10; i++)
			stack.push(i);
		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}
	}
}
