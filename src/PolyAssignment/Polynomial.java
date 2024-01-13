package PolyAssignment;
import java.util.Scanner;

public class Polynomial<E> implements ListInterface<E> {
	private PolyNode<E> head;

	public Polynomial() {
		this.head = new PolyNode<>(0, 0, null);
	}

	@Override
	public void add(String co, String ex) {
		try {
			int coef = Integer.parseInt(co);
			int expo = Integer.parseInt(ex);
			PolyNode<E> newNode = new PolyNode<>(coef, expo, null);

			PolyNode<E> currNode = head;
			// 리스트에 노드가 하나 이상 있고
			// 새 노드의 지수가 뒤의 노드보다 작은 경우 삽입

			while (currNode.next != null && expo < currNode.next.expo) {
				currNode = currNode.next;
			}
			// 삽입할 때 포인터 연결
			newNode.next = currNode.next;
			currNode.next = newNode;

		} catch (NumberFormatException e) {
			System.out.println("Error!");
		}
	}

	public void addPoly(Polynomial<E> p1, Polynomial<E> p2) {
		// 두 리스트의 각 노드를 비교하므로 head도 2개로 순회
		PolyNode<E> currNode1 = p1.head.next;
		PolyNode<E> currNode2 = p2.head.next;

		// 두 리스트 중 하나라도 남은 노드 있으면 반복
		while (currNode1 != null || currNode2 != null) {
			if (currNode1 == null) {
				add(Integer.toString(currNode2.coef), Integer.toString(currNode2.expo));
				currNode2 = currNode2.next;
			} else if (currNode2 == null) {
				add(Integer.toString(currNode1.coef), Integer.toString(currNode1.expo));
				currNode1 = currNode1.next;
			} else {
				if (currNode1.expo < currNode2.expo) {
					add(Integer.toString(currNode2.coef), Integer.toString(currNode2.expo));
					currNode2 = currNode2.next;
				} else if (currNode1.expo > currNode2.expo) {
					add(Integer.toString(currNode1.coef), Integer.toString(currNode1.expo));
					currNode1 = currNode1.next;
				} else {
					add(Integer.toString(currNode1.coef + currNode2.coef), Integer.toString(currNode1.expo));
					currNode1 = currNode1.next;
					currNode2 = currNode2.next;

				}
			}
		}
	}

	@Override
	public void printPoly() {
		PolyNode<E> currNode = head.next;
		while (currNode != null) {
			System.out.print(currNode.coef + " " + currNode.expo + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Polynomial<String> firstList = new Polynomial<>();
		Polynomial<String> secondList = new Polynomial<>();
		Polynomial<String> resultList = new Polynomial<>();

		System.out.print("첫번째 다항식 입력>> ");
		String[] input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length - 1; i += 2) {
			firstList.add(input[i], input[i + 1]);
		}

		System.out.print("두번째 다항식 입력>> ");
		input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length - 1; i += 2) {
			secondList.add(input[i], input[i + 1]);
		}

		System.out.print("다항식 덧셈 결과>> ");
		resultList.addPoly(firstList, secondList);

		resultList.printPoly();
		scan.close();
	}

}
