package Day4;

import java.util.Scanner;

public class Book {
	String title;
	String author;

	public Book(String t) {
		title = t;
		author = "작자미상";
	}

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book2 a_book = new Book2("어린왕자", "생텍쥐페리");
		Book2 b_book = new Book2("춘향전");

		System.out.printf("제목: %s\t저자: %s\n", a_book.title, a_book.author);
		System.out.printf("제목: %s\t저자: %s\n", b_book.title, b_book.author);
		scan.close();
	}
}
