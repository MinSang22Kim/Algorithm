import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() == b.length())
					return a.compareTo(b);
				else
					return a.length() - b.length();
			}
		});

		for (int i = 0; i < N; i++) {
			if (0 < i && arr[i].equals(arr[i - 1])) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
