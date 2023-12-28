package Day3;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		String s = scan.next();
		char c = s.charAt(0);
		for (int i = (int) c; i != 96; i--) {
			for (int j = 97; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		scan.close();
	}
}
