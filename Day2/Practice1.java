package Day2;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();
		int change, cost;
		// int oman, man, cheon, baek, osip, sip, il;
		System.out.println();

		change = money / 50000;
		cost = money - change * 50000;
		System.out.println("오만원권 " + change + "매");

		change = cost / 10000;
		cost = cost - change * 10000;
		System.out.println("만원권 " + change + "매");

		change = cost / 1000;
		cost = cost - change * 1000;
		System.out.println("천원권 " + change + "매");

		change = cost / 100;
		cost = cost - change * 100;
		System.out.println("백원 " + change + "개");

		change = cost / 50;
		cost = cost - change * 50;
		System.out.println("오십원 " + change + "개");

		change = cost / 10;
		cost = cost - change * 10;
		System.out.println("십원 " + change + "개");

		change = cost % 10;
		System.out.println("원 " + change + "");

		scan.close();
	}
}
