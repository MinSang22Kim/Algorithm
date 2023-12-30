package Day4;

import java.util.Scanner;

public class Book2 {
	String title;
	String author;

	public Book2(String title) {
//		this.title = title;
//		this.author = "작자미상";
		this(title, "작자미상"); // 매개변수 2개라 밑으로 이동
	}

	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
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
