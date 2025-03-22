import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        int[] cables = new int[K];
        long max = 0;

        // 입력과 동시에 최댓값 구하기
        for (int i = 0; i < K; i++) {
            int length = Integer.parseInt(br.readLine());
            cables[i] = length;
            if (length > max) {
                max = length;
            }
        }

        long left = 1;          // 최소 자를 길이
        long right = max + 1;   // 최대 자를 길이 (upper bound)
        long mid, count;

        // 이진 탐색 (Upper Bound 방식)
        while (left < right) {
            mid = (left + right) / 2;
            count = 0;

            for (int cable : cables) {
                count += (cable / mid);
            }

            if (count < N) {
                right = mid; // 자른 개수가 부족하니 길이를 줄임
            } else {
                left = mid + 1; // 충분히 잘렸으니 더 길게 자를 수도 있음
            }
        }

        // left는 N개를 만들 수 없는 가장 작은 길이 → 그래서 -1
        System.out.println(left - 1);
    }
}
