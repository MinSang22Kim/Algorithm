package Day3;

import java.util.Scanner;

public class AtoZ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = 'a';
		do {
			System.out.print(c);
			c = (char) (c + 1);
		} while (c <= 'z');
		scan.close();
	}
}
