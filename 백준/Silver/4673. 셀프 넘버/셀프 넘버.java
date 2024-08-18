import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static int d(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] checkNum = new boolean[100001]; // false

		for (int i = 0; i < 10001; i++) {
			int n = d(i);
			if (n < 10001)
				checkNum[n] = true;
		}
		for (int i = 0; i <= 10000; i++) {
			if (!checkNum[i])
				System.out.println(i);
		}
	}
}
