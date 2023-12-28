package Day3;

import java.util.Scanner;

public class BreakPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		while (true) {
			System.out.print(">> ");
			String sentence = scan.nextLine();
			if (sentence.equals("exit")) {
				System.out.println("종료합니다!");
				break;
			}
		}
		scan.close();
	}
}
