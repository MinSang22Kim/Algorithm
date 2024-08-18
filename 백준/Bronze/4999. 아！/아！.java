import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		if (s1.length() < s2.length()) {
			System.out.println("no");
		} else {
			System.out.println("go");
		}
		scan.close();
	}
}
