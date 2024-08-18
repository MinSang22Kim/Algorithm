import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		System.out.println(":fan::fan::fan:");
		System.out.printf(":fan::" + id + "::fan:\n");
		System.out.println(":fan::fan::fan:");
		scan.close();
	}
}
