import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = {a, b, c};

        Arrays.sort(arr); // 오름차순으로 변 길이 정렬

        // 가장 긴 변의 길이가 나머지 두 변의 합 이상인 경우
        if (arr[0] + arr[1] <= arr[2]) {
            // 두 변의 합보다 1작게(길이는 정수니까) 하여 삼각형 조건 충족
            arr[2] = arr[0] + arr[1] - 1;
        }

        sb.append(arr[0] + arr[1] + arr[2]);
        System.out.println(sb);
    }
}
