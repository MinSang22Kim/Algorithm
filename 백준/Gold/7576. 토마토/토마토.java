import java.io.*;
import java.util.*;

public class Main {
    static int N; // 세로 칸의 수
    static int M; // 가로 칸의 수
    static int days = 0; // 익는 데 걸리는 날짜
    static int[][] graph; // 토마토 상자
    static boolean[][] visited; // 방문한 자리
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static Queue<int[]> q = new LinkedList<>(); // 익은 토마토 위치 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로
        graph = new int[N][M]; // 박스 크기 초기화

        // 토마토 상자의 상태 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                // 익은 토마토(1)인 경우 큐에 삽입
                if (graph[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        bfs(); // BFS를 먼저 실행하여 최소 날짜 계산

        // checkAllRipe로 모든 토마토가 익을 수 있는지 확인
        // 모두 익는다면, 결과값 출력
        // 모두 익을 수 없으면, -1을 출력
        bw.write(checkAllRipe() ? String.valueOf(days) : "-1");
        bw.flush();
        bw.close();
    }

    // BFS 탐색 메서드
    private static int bfs() {
        // 큐가 비어있지 않다면(익은 토마토가 있다면) 계속 탐색
        while (!q.isEmpty()) {
            int size = q.size(); // 현재 큐에 있는 토마토 수
            boolean progressed = false; // 하루 동안 토마토가 익었는지 확인(하루가 끝날 때마다 false로 초기화)

            // 현재 큐에 있는 모든 토마토에 대해 탐색
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];

                // 4방향 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    // 유효 범위 && 안익은 토마토(0)인 경우
                    if (nx >= 0 && ny >= 0 && nx < N && ny < M && graph[nx][ny] == 0) {
                        graph[nx][ny] = 1; // 익은 토마토로 변경
                        q.add(new int[]{nx, ny}); // 새로 익은 토마토는 큐에 추가
                        progressed = true; // 익은 토마토가 발생했음을 기록
                    }
                }
            }
            // 큐의 모든 요소 탐색이 끝나고(하루 끝) progressed를 확인
            // 만약 하루 동안 토마토가 익었으면(progressed가 true라면) 날짜 증가
            if (progressed) {
                days++;
            }
        }
        return days;
    }

    // 모든 토마토가 익었는지 확인하는 메서드
    private static boolean checkAllRipe() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익지 않은 토마토(0)가 남아있는 경우
                if (graph[i][j] == 0) {
                    return false;
                }
            }
        }
        // 모두 익은 경우
        return true;
    }
}
