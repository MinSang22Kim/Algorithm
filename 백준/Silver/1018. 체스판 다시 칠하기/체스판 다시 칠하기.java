import java.io.*;
import java.util.*;

public class Main {
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] sampleBoard = {"WBWBWBWB", "BWBWBWBW"}; // 화이트 버전, 블랙 버전
        int whiteCount = 0;

        for (int i = 0; i < 8; i++) { // 세로 8
            int row = startRow + i;
            for (int j = 0; j < 8; j++) { // 가로 8
                int col = startCol + j;
                if (board[row].charAt(col) != sampleBoard[row % 2].charAt(j)) {
                    whiteCount++;
                }
            }
        }
        return Math.min(whiteCount, 64 - whiteCount);
    }

    public static void main(String[] args) throws IOException {
        // Step 1. input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        // Step 2. 체스판 자르기
        int count = Integer.MAX_VALUE; // 가장 큰값으로 지정(초기값)
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // Step 3. 현 체스판의 최소 비용 구하기
                int resultCount = getSolution(i, j, board);
                // Step 4. 전체 최적의 값과 비교 후 갱신
                count = Math.min(count, resultCount);
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
