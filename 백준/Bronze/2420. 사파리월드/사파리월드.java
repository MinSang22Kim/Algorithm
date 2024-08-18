import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		System.out.printf("%d", Math.abs(a-b));
	}
}
