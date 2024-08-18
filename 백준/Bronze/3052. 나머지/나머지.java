import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cnt = 0;
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt() % 42;
		}

		for (int i = 0; i < 10; i++) {
			boolean check = false;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				cnt++;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}
