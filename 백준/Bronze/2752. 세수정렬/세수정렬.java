import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < 3; i++)
			arr[i] = scan.nextInt();

		Arrays.sort(arr);

		for (int i = 0; i < 3; i++)
			System.out.print(arr[i] + " ");

		scan.close();
	}
}
