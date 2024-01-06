package Day5;

import java.util.Scanner;

// 소스코드, 결과화면 lms 제출

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class Practice5 {
	Scanner scan = new Scanner(System.in);
	private Day days[];

	Practice5(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		scan = new Scanner(System.in);
	}

	private void inputWork() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scan.next();
		day--;
		if (day < 0 || day > 30) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);
	}

	private void showWork() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt() - 1;
		if (day < 0 || day > 30) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은 ");
		days[day].show();
	}

	public void run() {
		System.out.print("이번달 스케쥴 관리 프로그램.");
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				inputWork();
				break;
			case 2:
				showWork();
				break;
			case 3:
				System.out.println("스케줄러를 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Practice5 month = new Practice5(30);
		month.run();
	}

}