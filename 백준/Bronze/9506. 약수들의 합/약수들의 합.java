import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break; // 종료 조건
            }

            List<Integer> list = new ArrayList<Integer>(); // 약수 담는 리스트
            int sum = 0; // 약수들의 합

            // 1~n 순회하며 약수찾기
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;

                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n);

            // 완전수인 경우
            if (sum == n) {
                sb.append(" = ");

                for (int i : list) {
                    sb.append(i).append(" + ");
                }

                sb.delete(sb.length() - 3, sb.length()); // 마지막 " + "는 삭제
            } else {
                // 완전수가 아닌 경우
                sb.append(" is NOT perfect.");
            }

            System.out.println(sb);
        }
    }
}
