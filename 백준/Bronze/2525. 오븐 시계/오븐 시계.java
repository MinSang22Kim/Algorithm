import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int plus_time = scan.nextInt();
		int all_minute = hour * 60 + minute;
		all_minute += plus_time;
		System.out.printf("%d %d\n", (all_minute / 60) % 24, all_minute % 60);
	}
}