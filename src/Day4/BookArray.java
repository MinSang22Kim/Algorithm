package Day4;

import java.util.Scanner;

class Book3 {
	String title;
	String author;

	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book3[] b = new Book3[2];
		for (int i = 0; i < b.length; i++) {
			System.out.print("제목 >> ");
			String title = scan.nextLine();
			System.out.print("저자 >> ");
			String author = scan.nextLine();
			b[i] = new Book3(title, author);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.printf("제목: %s, 저자: %s\n", b[i].title, b[i].author);
		}

		scan.close();
	}
}
