import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 학생 수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken()); // 사이즈별 티셔츠 신청자 수
        }

        st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken()); // 티셔츠 묶음 수
        int P = Integer.parseInt(st.nextToken()); // 펜 묶음 수

        int cnt = 0;
        for (int i = 0; i < size.length; i++) {
            cnt += size[i] / T;
            if (size[i] % T != 0) {
                cnt++;
            }
        }

        sb.append(cnt).append("\n");
        sb.append(N / P).append(" ").append(N % P);
        System.out.println(sb);
    }
}
