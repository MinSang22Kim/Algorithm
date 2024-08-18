import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> h = new HashMap<String, Integer>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			h.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}

		int minValue = Collections.min(h.values());

		for (String key : h.keySet()) {
			if (h.get(key) == minValue)
				System.out.println(key);
		}
	}
}
