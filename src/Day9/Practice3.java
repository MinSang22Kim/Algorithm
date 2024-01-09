package Day9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> score = new HashMap<String, Double>();
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = scan.next();
			Double grade = scan.nextDouble();
			score.put(name, grade);
			System.out.println();
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double prize = scan.nextDouble();

		Set<String> keys = score.keySet();

		System.out.print("\n장학생 명단: ");
		for (String name : keys) {
			if (score.get(name) >= prize)
				System.out.print(name + " ");
		}
		scan.close();
	}
}