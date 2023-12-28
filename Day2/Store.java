package Day2;
import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("무슨 과일 드릴까요? ");
		String fruit = scan.next();
		switch (fruit) {
		case "mango":
			System.out.println("망고는 1500원");
			break;
		case "apple":
			System.out.println("사과는 500원");
			break;
		case "banana":
			System.out.println("바나나는 500원");
			break;
		case "orange":
			System.out.println("오렌지는 100원");
			break;
		default:
			System.out.println("메뉴에 없음");
		}
		scan.close();
	}
}
