import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fb(n));
	}
	static int fb(int n) {
		if(n == 0) return 0;
		else if (n == 1 || n==2) return 1;
		else return fb(n-1) + fb(n-2);
	}
}