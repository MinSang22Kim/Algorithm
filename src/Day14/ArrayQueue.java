package Day14;

public class ArrayQueue<E> implements QueueInterface<E> {
	private E queue[];
	private int front, tail, numItems;
	private static final int DEFAULT_CAPACITY = 64;

	public ArrayQueue(int n) {
		queue = (E[]) new Object[n];
		front = 0;
		tail = n - 1;
		numItems = 0;
	}

	public ArrayQueue() {
		queue = (E[]) new Object[DEFAULT_CAPACITY];
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}

	private boolean isFull() {
		return (numItems == queue.length);
	}

	@Override
	public void enqueue(E newItem) {
		if (isFull())
			System.out.println("큐가 꽉참");
		else {
			tail = (tail + 1) % queue.length;
			queue[tail] = newItem;
			numItems++;
		}
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			System.out.println("큐가 빔");
			return null;
		} else {
			E queueFront = queue[front];
			numItems--;
			return queueFront;
		}
	}

	@Override
	public E front() {
		if (isEmpty())
			return null;
		else
			return queue[front];
	}

	@Override
	public boolean isEmpty() {
		return (numItems == 0);
	}

	@Override
	public void dequeueAll() {
		queue = (E[]) new Object[queue.length];
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}

	public void printQueue() {
		if (isEmpty())
			System.out.println("큐가 비어있음");
		else {
			int current = front;
			for (int i = 0; i < numItems; i++) {
				System.out.println(queue[current] + " ");
				current = (current + 1) % queue.length;
			} // 다음을 가리키려면 +1에다가 큐의 길이로 나누어야 함(원형큐)
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArrayQueue<String> q = new ArrayQueue<>();

		q.enqueue("test 1");
		q.enqueue("test 2");
		q.enqueue("test 3");
		q.enqueue("test 4");
		q.enqueue("test 5");
		q.enqueue("test 6");
		q.enqueue("test 7");

		q.printQueue();

	}
}
