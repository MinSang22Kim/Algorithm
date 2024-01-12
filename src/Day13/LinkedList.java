package Day13;

public class LinkedList<E> {
	private Node<E> head;
	private int numItems;

	public LinkedList() {
		numItems = 0;
		head = new Node<>(null, null);
	}

	public void add(int index, E x) {
		if (0 <= index && index <= numItems) {
			Node<E> prevNode = getNode(index - 1);
			Node<E> newNode = new Node<>(x, prevNode.next);
			prevNode.next = newNode;
			numItems++;
		} else {
			System.out.println("삽입 오류!");
		}
	}

	public void append(E x) {
		Node<E> prevNode = head; // 더미헤드
		while (prevNode.next != null)
			prevNode = prevNode.next;
		Node<E> newNode = new Node<>(x, null);
		prevNode.next = newNode;
		numItems++;
	}

	public E remove(int index) {
		if (0 <= index && index <= numItems - 1) {
			Node<E> prevNode = getNode(index - 1);
			Node<E> currNode = prevNode.next;
			prevNode.next = currNode.next;
			numItems--;
			return currNode.item;
		} else
			return null;
	}

	public boolean removeItem(E x) {
		Node<E> currNode = head;
		for (int i = 0; i <= numItems - 1; i++) {
			Node<E> prevNode = currNode;
			currNode = prevNode.next;
			if (((Comparable) (currNode.item)).compareTo(x) == 0) {
				prevNode.next = currNode.next;
				numItems--;
				return true;
			}
		}
		return false;
	}

	public E get(int index) {
		if (0 <= index && index <= numItems - 1)
			return getNode(index).item;
		else
			return null;
	}

	public void set(int index, E x) {
		if (0 <= index && index < -numItems - 1)
			getNode(index).item = x;
		else
			System.out.println("Error!");
	}

	private Node<E> getNode(int index) {
		if (-1 <= index && index <= numItems - 1) {
			Node<E> currNode = head;
			for (int i = 0; i <= index; i++)
				currNode = currNode.next;
			return currNode;
		} else
			return null;
	}

	private final int NOT_FOUND = -1;

	public int indexOf(E x) {
		Node<E> currNode = head;
		for (int i = 0; i <= numItems; i++) {
			currNode = currNode.next;
			if (((Comparable) (currNode.item)).compareTo(x) == 0)
				return i;
		}
		return NOT_FOUND;
	}

	public int size() {
		return numItems;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}

	public void clear() {
		numItems = 0;
		head = new Node(null, null);
	}

	public void print() {
		Node<E> currNode = head.next;
		for (int i = 0; i < numItems; i++) {
			System.out.print(currNode.item + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
}