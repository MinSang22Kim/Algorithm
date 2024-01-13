package PolyAssignment;

public class PolyNode<E> {
	int coef; // 계수
	int expo; // 지수
	PolyNode<E> next;

	public PolyNode() {
		next = null;
	}

	public PolyNode(int coef, int expo, PolyNode<E> next) {
		this.coef = coef;
		this.expo = expo;
		this.next = next;
	}

	public void addNode(int coef, int expo) {
		PolyNode<E> newNode = new PolyNode<>(coef, expo, this.next);
		this.next = newNode;
	}

}
