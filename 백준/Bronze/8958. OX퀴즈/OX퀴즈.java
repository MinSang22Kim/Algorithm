import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int sum = 0, score = 0;
			String quiz = scan.next();
			for (int j = 0; j < quiz.length(); j++) {
				if (quiz.charAt(j) == 'X') {
					score = 0;
				} else if (quiz.charAt(j) == 'O') {
					score++;
					sum += score;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
