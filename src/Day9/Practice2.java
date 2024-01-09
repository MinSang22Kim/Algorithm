package Day9;

import java.util.HashMap;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> countrySearch = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		while (true) {
			System.out.print("\n나라 이름, 인구 >> ");
			String country = scan.next();
			if (country.equals("그만"))
				break;

			int people = scan.nextInt();
			countrySearch.put(country, people);
		}

		while (true) {
			System.out.print("\n인구 검색 >> ");
			String country = scan.next();
			if (country.equals("그만"))
				break;

			Integer population = countrySearch.get(country);
			if (population == null) {
				System.out.println("\n" + country + " 나라는 없습니다.");
			} else {
				System.out.println("\n" + country + "의 인구는 " + population);
			}
		}

		scan.close();
	}
}
