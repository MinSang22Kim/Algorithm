import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 0의 개수는 10(2*5)을 곱하여 생성
        // 2의 개수는 충분히 많으므로 5의 개수에 따라 0의 개수 생성
        for (int i = 5; i <= N; i *= 5) {
            cnt += N / i;
        }

        // 10 = 2 * 5   (5가 1개면 0이 1개)
        // 100 = 4 * 25 (5가 2개면 0이 2개) ...
        System.out.println(cnt);
    }
}
