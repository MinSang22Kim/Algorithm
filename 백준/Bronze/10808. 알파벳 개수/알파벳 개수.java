import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == i + 97) {
					cnt++;
				}
			}
			System.out.print(cnt + " ");
		}
		scan.close();
	}
}
