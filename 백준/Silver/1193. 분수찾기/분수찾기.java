import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int i = 1, count = 0;
		int upNum = 0, downNum = 0;

		while (count < X) {
			count += i;
			i++;
		}

		if ((i - 1) % 2 == 0) {
			downNum = 1 + (count - X);
			upNum = (i - 1) - (count - X);
		} else {
			downNum = (i - 1) - (count - X);
			upNum = 1 + (count - X);
		}

		System.out.println(upNum + "/" + downNum);
		scan.close();
	}
}
