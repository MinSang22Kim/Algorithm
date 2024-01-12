package Day13;

import java.util.Scanner;

public class LinkedStack<E> implements StackInterface<E> {
	private Node<E> topNode;
	private final E ERROR = null;

	public LinkedStack() {
		topNode = null;
	}

	public void push(E newItem) {
		topNode = new Node<>(newItem, topNode);
	}

	public E pop() {
		if (isEmpty())
			return ERROR;
		else {
			Node<E> temp = topNode;
			topNode = topNode.next;
			return temp.item;
		}
	}

	public E top() {
		if (isEmpty())
			return ERROR;
		else
			return topNode.item;
	}

	public boolean isEmpty() {
		return (topNode == null);
	}

	public void popAll() {
		topNode = null;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedStack<Integer> s = new LinkedStack<>();
		s.push(3000);
		s.push(2000);
		s.push(1000);

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		scan.close();
	}

}
