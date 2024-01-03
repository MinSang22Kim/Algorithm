package Day5;

import java.util.Scanner;

class Grade {
	int math;
	int sci;
	int eng;

	public Grade() {

	} // 기본 생성자

	public Grade(int math, int sci, int eng) {
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	} // 주어진 케이스

	public int average() {
		return (math + sci + eng) / 3;
	}

}

public class Practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scan.nextInt();
		int sci = scan.nextInt();
		int eng = scan.nextInt();
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.average() + " 입니다.");

		scan.close();
	}
}
