import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[6];
		int[] arr2 = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < 6; i++) {
			arr1[i] = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			System.out.print((arr2[i] - arr1[i]) + " ");
		}
		scan.close();
	}
}
