package Day7;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

		char[] alphabet = new char[26];
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 65);
		}

		while (true) {
			String text = scan.next();
			if (text.equals(";"))
				break;
			sb.append(text.toUpperCase());
		}

		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]);
			for (int j = 0; j < sb.length(); j++) {
				if (alphabet[i] == sb.charAt(j))
					System.out.print("-");
			}
			System.out.println();
		}

		scan.close();
	}
}