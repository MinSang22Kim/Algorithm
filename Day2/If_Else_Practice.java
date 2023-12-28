package Day2;
import java.util.Scanner;

public class If_Else_Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수와 학년을 빈칸으로 구분하여 입력:");
		int score = scan.nextInt();
		int year = scan.nextInt();
		if (year == 4) {
			if (score >= 70) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격...");
			}
		} else {
			if (score >= 60) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격...");
			}
		}
		scan.close();
	}
}