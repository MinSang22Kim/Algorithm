package Day8;

import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

		// char[] alphabet = new char[26];
		StringBuffer sb = new StringBuffer();

		while (true) {
			String text = scan.next();
			if (text.equals(";"))
				break;
			sb.append(text.toUpperCase());
		}
		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (i + 65));
			for (int j = 0; j < sb.length(); j++) {
				if ((char) (i + 65) == sb.charAt(j))
					System.out.print("-");
			}
			System.out.println();
		}
		scan.close();
	}
}
