import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int all_minute = hour * 60 + minute;
		all_minute -= 45;
		if (all_minute <= 0) {
			all_minute += 1440;
		}
		System.out.printf("%d %d\n", (all_minute / 60) % 24, all_minute % 60);
	}
}