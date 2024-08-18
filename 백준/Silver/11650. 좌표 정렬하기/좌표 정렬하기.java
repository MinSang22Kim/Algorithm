import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[][] arr = new int[num][2];

		for (int i = 0; i < num; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}

		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int i = 0; i < num; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		scan.close();
	}
}
