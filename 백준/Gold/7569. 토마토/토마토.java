import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] graph;       // 3차원 배열 (토마토 창고)
    static boolean[][][] visited; // 방문 여부 판단 3차원 배열

    // 6방향 탐색을 위한 델타 값
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    static int m, n, h;

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean hasUnripeTomato = false;

        // 초기 익은 토마토 위치 큐에 저장
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (graph[z][y][x] == 1) {
                        queue.add(new int[]{z, y, x});
                        visited[z][y][x] = true;
                    }
                    if (graph[z][y][x] == 0) {
                        hasUnripeTomato = true;
                    }
                }
            }
        }

        if (!hasUnripeTomato) return 0; // 모두 익어있음

        int days = 0;

        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();

            for (int i = 0; i < currentLevelSize; i++) {
                int[] pos = queue.poll();
                int z = pos[0], y = pos[1], x = pos[2];

                for (int d = 0; d < 6; d++) {
                    int nz = z + dz[d];
                    int ny = y + dy[d];
                    int nx = x + dx[d];

                    if (nz >= 0 && ny >= 0 && nx >= 0 && nz < h && ny < n && nx < m) {
                        if (!visited[nz][ny][nx] && graph[nz][ny][nx] == 0) {
                            visited[nz][ny][nx] = true;
                            graph[nz][ny][nx] = 1;
                            queue.add(new int[]{nz, ny, nx});
                        }
                    }
                }
            }

            days++;
        }

        // 모든 토마토가 익었는지 확인
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (graph[z][y][x] == 0) {
                        return -1;
                    }
                }
            }
        }

        return days - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 가로(x)
        n = Integer.parseInt(st.nextToken()); // 세로(y)
        h = Integer.parseInt(st.nextToken()); // 높이(z)

        graph = new int[h][n][m];
        visited = new boolean[h][n][m];

        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < m; x++) {
                    graph[z][y][x] = Integer.parseInt(st.nextToken());
                }
            }
        }

        int result = bfs();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }
}
