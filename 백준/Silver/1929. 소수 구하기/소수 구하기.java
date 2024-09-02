import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        // 에라토스테네스의 체: 2부터 sqrt(N)까지 소수 찾기
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) { // 보통 이 수가 소수가 됨
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // i의 배수는 모두 false
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
