import java.util.Scanner;

public class Main {
	public static int Y(int total) {
		int cost = total / 30 + 1;
		return cost * 10;
	}

	public static int M(int total) {
		int cost = total / 60 + 1;
		return cost * 15;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int call = 0, ysum = 0, msum = 0;
		for (int i = 0; i < n; i++) {
			call = scan.nextInt();
			ysum += Y(call);
			msum += M(call);
		}
		if (ysum > msum) {
			System.out.println("M " + msum);
		} else if (ysum < msum) {
			System.out.println("Y " + ysum);
		} else {
			System.out.println("Y M " + msum);
		}
		scan.close();
	}
}
