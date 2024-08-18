import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int distance(int x, int y, int w, int h) {
		if (x <= w / 2 && y <= h / 2)
			return x <= y ? x : y;
		else if (x <= w / 2 && y > h / 2)
			return x <= (h - y) ? x : h - y;
		else if (x > w / 2 && y <= h / 2)
			return (w - x) <= y ? w - x : y;
		else if (x > w / 2 && y > h / 2)
			return (w - x) <= (h - y) ? w - x : h - y;
		else
			return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		System.out.println(distance(x, y, w, h));
	}
}
