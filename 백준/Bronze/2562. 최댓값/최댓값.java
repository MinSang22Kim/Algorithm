import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0, cnt = 0;
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		scan.close();
	}
}
