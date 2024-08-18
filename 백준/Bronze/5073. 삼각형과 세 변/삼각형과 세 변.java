import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String triangle(int[] arr) {
		if (arr[0] + arr[1] > arr[2]) {
			if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0])
				return "Equilateral\n";
			else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0])
				return "Isosceles\n";
			else
				return "Scalene\n";
		} else {
			return "Invalid\n";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[3];

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;

			Arrays.sort(arr);
			bw.write(triangle(arr));
		}

		bw.flush();
		bw.close();
	}
}
