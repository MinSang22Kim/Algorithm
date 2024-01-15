package Day14;

public class LinkedQueue<E> implements QueueInterface<E> {
	private Node<E> tail;

	public LinkedQueue() {
		tail = null;
	}

	public void enqueue(E newItem) {
		Node<E> newNode = new Node<>(newItem);
		if (isEmpty()) {
			newNode.next = newNode;
			tail = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public E dequeue() {
		if (isEmpty())
			return null;
		else {
			E tmp = tail.next.item;
			if (tail.next == tail) {
				tail = null;
			} else {
				tail.next = tail.next.next;
			}
			return tmp;
		}
	}

	@Override
	public E front() {
		if (isEmpty())
			return null;
		else
			return tail.next.item;
	}

	@Override
	public boolean isEmpty() {
		return (tail == null);
	}

	@Override
	public void dequeueAll() {
		tail = null;
	}

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("큐가 비어 있습니다.");
		} else {
			Node<E> current = tail.next;
			do {
				System.out.print(current.item + " ");
				current = current.next;
			} while (current != tail.next);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		LinkedQueue<String> q = new LinkedQueue<>();
		q.enqueue("hello 1");
		q.enqueue("hello 2");
		q.enqueue("hello 3");
		q.enqueue("hello 4");
		System.out.println(q.dequeue());
		q.printQueue();
	}
}
