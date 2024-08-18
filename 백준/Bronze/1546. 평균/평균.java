import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double max = 0, sum = 0;
		int n = scan.nextInt();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] * 100 / max;
			sum += arr[i];
		}

		System.out.println(sum / n);
		scan.close();
	}
}
