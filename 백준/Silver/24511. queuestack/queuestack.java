import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 자료구조 개수
        String[] isStack = br.readLine().split(" "); // 큐는 0, 스택은 1
        String[] nums = br.readLine().split(" "); // 각 자료구조에 들어가는 원소들

        int M = Integer.parseInt(br.readLine()); // 삽입할 수열의 길이
        String[] insert = br.readLine().split(" "); // 삽입할 숫자들

        Deque<Integer> qs = new ArrayDeque<>(); // 큐스택을 담을 하나의 덱

        for (int i = 0; i < N; i++) {
            // 큐인 경우에만 변화가 있음
            // 예를 들어 스택(1)인 곳에 2를 넣고 다시 pop 하면 2를 반환
            if (isStack[i].equals("0")) { // 큐(0)인 경우
                qs.addLast(Integer.parseInt(nums[i]));
            }
        }

        StringBuilder sb = new StringBuilder();

        // 앞에서 큐인 경우(변화가 존재하는 경우)만 넣었음
        // 숫자 바꿔치기 하면 됨(각 자료구조에 원소 1개이므로)
        for (int i = 0; i < M; i++) {
            qs.addFirst(Integer.parseInt(insert[i])); // 숫자 앞에 삽입
            sb.append(qs.pollLast()).append(" "); // 뒤의 값을 출력에 추가
        }

        System.out.println(sb.toString());
    }
}
