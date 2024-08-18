import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int R = scan.nextInt();
			String word = scan.next();
			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}