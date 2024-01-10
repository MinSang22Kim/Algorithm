package Day11;

public class ArrayList<E> implements ListInterface<E> {
	private E[] item;
	private int numItems;
	private static final int DEFAULT_CAPACITY = 64;

	public ArrayList() {
		item = (E[]) new Object[DEFAULT_CAPACITY];
		numItems = 0;
	}

	public ArrayList(int n) {
		item = (E[]) new Object[n];
		numItems = 0;
	}

	public void add(int index, E x) {
		if (numItems >= item.length || index < 0 || index > numItems) {
			System.out.println("Error!");
		} else {
			for (int i = numItems - 1; i >= index; i--) {
				item[i + 1] = item[i];
			}
			item[index] = x;
			numItems++;
		}
	}

	public void append(E x) {
		if (numItems >= item.length) {
			System.out.println("Error!");
		} else {
			item[numItems++] = x;
		}
	}

	public E remove(int index) {
		if (isEmpty() || index < 0 || index > numItems - 1) {
			return null;
		} else {
			E tmp = item[index];
			for (int i = index; i <= numItems - 2; i++) {
				item[i] = item[i + 1];
			}
			numItems--;
			return tmp;
		}
	}

	public boolean removeItem(E x) {
		int k = 0;
		while (k < numItems && ((Comparable) item[k]).compareTo(x) != 0)
			k++;
		if (k == numItems)
			return false;
		else {
			for (int i = k; i <= numItems - 2; i++) {
				item[i] = item[i + 1];
			}
			numItems--;
			return true;
		}
	}

	public E get(int index) {
		if (index >= 0 && index <= numItems - 1)
			return item[index];
		else
			return null;
	}

	public void set(int index, E x) {
		if (index >= 0 && index <= numItems - 1)
			item[index] = x;
		else
			System.out.println("Error!");
	}

	private final int NOTFOUND = -1;

	public int indexOf(E x) {
		int i = 0;
		while (i < numItems && ((Comparable) item[i]).compareTo(x) != 0)
			i++;
		if (i == numItems)
			return NOTFOUND;
		else
			return i;
	}

	public int size() {
		return numItems;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}

	public void clear() {
		item = (E[]) new Object[item.length];
		numItems = 0;
	}

	public void print() {
		for (int i = 0; i < numItems; i++) {
			System.out.print(item[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 300); // 오토박싱
		list.print();

		list.add(0, 100);
		list.print();

		list.append(500);
		list.print();

		list.remove(2);
		list.print();

		list.append(700);
		list.print();

		list.remove(1);
		list.print();

		list.removeItem(100);
		list.print();
	}
}