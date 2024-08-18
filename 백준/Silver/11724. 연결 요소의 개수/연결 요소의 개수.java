import java.util.Scanner;

public class Main {
	static int N, M, cnt;
	static boolean[][] graph;
	static boolean[] visit; // 방문 여부 체크

	public static void dfs(int i) {
		visit[i] = true;
		for (int j = 1; j <= N; j++) {
			if (graph[i][j] == true && visit[j] == false) {
				dfs(j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		graph = new boolean[N + 1][N + 1];
		visit = new boolean[N + 1];

		for (int i = 1; i <= M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = true;
			graph[b][a] = true;
		}

		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				cnt++;
				dfs(i);
			}
		}

		System.out.println(cnt);
		scan.close();
	}
}