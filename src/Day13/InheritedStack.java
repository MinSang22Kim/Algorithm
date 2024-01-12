package Day13;

import java.util.Scanner;

public class InheritedStack<E> extends LinkedList<E> implements StackInterface<E> {
	public InheritedStack() {
		super();
	}

	public void push(E newItem) {
		add(0, newItem);
	}

	public E pop() {
		return remove(0);
	}

	public E top() {
		return get(0);
	}

	public void popAll() {
		clear();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InheritedStack<Integer> ins = new InheritedStack<>();
		ins.push(300);
		ins.push(200);
		ins.push(100);

		System.out.println(ins.pop());
		System.out.println(ins.pop());
		System.out.println(ins.pop());
		System.out.println(ins.pop());
		scan.close();
	}
}
