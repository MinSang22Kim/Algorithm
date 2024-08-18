import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int a = 1, b = 1, max = arr[0][0];
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					max = arr[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a + " " + b);
	}
}
