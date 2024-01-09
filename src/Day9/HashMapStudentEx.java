package Day9;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	int id;
	String tel;

	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Student> phoneBook = new HashMap<String, Student>();

		phoneBook.put("김민상", new Student(1, "010 - 111 - 1111"));
		phoneBook.put("이형석", new Student(2, "010 - 222 - 2222"));
		phoneBook.put("홍원택", new Student(3, "010 - 333 - 3333"));

		while (true) {
			System.out.print("검색할 이름? ");
			String name = scan.next();
			if (name.equals("exit"))
				break;
			Student student = phoneBook.get(name);
			if (student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id: " + student.id + "  전화번호: " + student.tel);
		}
		scan.close();
	}
}
