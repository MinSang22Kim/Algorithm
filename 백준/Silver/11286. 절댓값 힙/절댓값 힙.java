import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
			if (Math.abs(o1) == Math.abs(o2)) {
				return o1 > o2 ? 1 : -1;
			}
			return Math.abs(o1) - Math.abs(o2);
		});

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (q.isEmpty()) {
					bw.write(0 + "\n");
				} else
					bw.write(q.poll() + "\n");
			} else if (x != 0) {
				q.add(x); // 위에서 우선순위 큐를 구현해서 잘 정렬되어 저장
			}
		}
		bw.flush();
		bw.close();
	}
}