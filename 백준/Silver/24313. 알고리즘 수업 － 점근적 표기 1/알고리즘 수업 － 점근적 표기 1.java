import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        checkTimeComplexity(a1, a0, c, n);
    }

    private static void checkTimeComplexity(int a1, int a0, int c, int n) {
        // O(g(n)) = {f(n) | 모든 n ≥ n0에 대해 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재}
        if ((a1 * n + a0 <= c * n) && a1 <= c) { // n=1인 경우, a1+a0 <= c를 만족해야 함
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
