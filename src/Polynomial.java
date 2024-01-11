import java.util.Scanner;

public class Polynomial<E> implements ListInterface<E> {
	private PolyNode<E> head;

	@Override
	public void add(String coef, String expo) {

	}

	@Override
	public void addPoly(E x, E y) {
	}

//	public void add(int index, E x) {
//		if (0 <= index && index <= numItems) {
//			Node<E> prevNode = getNode(index - 1);
//			Node<E> newNode = new Node<>(x, prevNode.next);
//			prevNode.next = newNode;
//			numItems++;
//		} else {
//			System.out.println("삽입 오류!");
//		}
//	}

	public void printPoly() {
		PolyNode<E> currNode = head.next;
		while (currNode != null) {
			System.out.print(currNode.coef + "x" + "^" + currNode.expo + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PolyNode<Integer> firstList = new PolyNode<>();
		PolyNode<Integer> secondList = new PolyNode<>();
		PolyNode<Integer> resultList = new PolyNode<>();

		System.out.println("첫번째 다항식 입력>>");
		String[] input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length(); i += 2) {
			firstList.add(input[i], input[i + 1]);
		}

		System.out.println("두번째 다항식 입력>>");

		System.out.println("다항식 덧셈 결과>>");

		scan.close();
	}

}
