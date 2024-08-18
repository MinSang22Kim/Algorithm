import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		bw.write(Long.toString(factorial(N)));
		bw.flush();
		bw.close();
	}
}
