package Day13;

import java.util.Scanner;

public class ListStack<E> implements StackInterface<E> {
	private LinkedList<E> list;

	public ListStack() {
		list = new LinkedList<E>();
	}

	@Override
	public void push(E newItem) {
		list.add(0, newItem);
	}

	@Override
	public E pop() {
		return list.remove(0);
	}

	@Override
	public E top() {
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void popAll() {
		list.clear();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListStack<Integer> ls = new ListStack<>();
		ls.push(700);
		ls.push(500);
		ls.push(300);

		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		scan.close();
	}
}
