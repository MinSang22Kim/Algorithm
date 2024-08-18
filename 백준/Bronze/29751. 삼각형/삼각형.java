import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		System.out.println((float) W * H / 2);
		scan.close();
	}
}
