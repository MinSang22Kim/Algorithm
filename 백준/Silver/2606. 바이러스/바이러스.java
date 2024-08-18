import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N, M, virus;
	static boolean[][] graph;
	static boolean[] visit;

	public static int dfs(int index) {
		visit[index] = true;
		for (int i = 1; i <= N; i++) {
			if (graph[index][i] == true && visit[i] == false) {
				virus++;
				dfs(i);
			}
		}
		return virus;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		graph = new boolean[N + 1][N + 1];
		visit = new boolean[N + 1];

		visit[1] = true; // 1번 컴퓨터는 감염

		for (int i = 1; i <= M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = true;
			graph[y][x] = true;
		}

		bw.write(Integer.toString(dfs(1)));
		bw.flush();
		bw.close();
	}
}
