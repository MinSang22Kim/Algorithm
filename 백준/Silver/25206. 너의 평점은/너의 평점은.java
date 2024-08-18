import java.util.Scanner;

public class Main {
	public static double returnScore(String grade) {
		switch (grade) {
		case "A+":
			return 4.5;
		case "A0":
			return 4.0;
		case "B+":
			return 3.5;
		case "B0":
			return 3.0;
		case "C+":
			return 2.5;
		case "C0":
			return 2.0;
		case "D+":
			return 1.5;
		case "D0":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scoreSum = 0;
		double gradeSum = 0.0;

		for (int i = 0; i < 20; i++) {
			String subject = scan.next();
			double score = scan.nextDouble();
			String grade = scan.next();
			if (grade.equals("P"))
				continue;
			gradeSum += (score * returnScore(grade));
			scoreSum += score;
		}
		System.out.printf("%.6f\n", gradeSum / scoreSum);
		scan.close();
	}
}