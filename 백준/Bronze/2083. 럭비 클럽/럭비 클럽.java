import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String name = scan.next();
			int age = scan.nextInt();
			int weight = scan.nextInt();
			if (age == 0 && weight == 0) {
				break;
			}
			if (age > 17 || weight >= 80) {
				System.out.printf("%s Senior", name);
			} else {
				System.out.printf("%s Junior", name);
			}
			System.out.println();
		}
		scan.close();
	}
}