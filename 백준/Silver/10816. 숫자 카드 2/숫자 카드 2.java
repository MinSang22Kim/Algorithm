import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> haveCard = new HashMap<>();

        // 첫 번째 줄 입력: 숫자 카드 개수
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄 입력: 상근이가 가진 카드 숫자들
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            haveCard.put(card, haveCard.getOrDefault(card, 0) + 1);  // 숫자 카드를 해시맵에 추가 및 개수 증가
        }

        // 세 번째 줄 입력: 찾을 카드 개수
        int m = Integer.parseInt(br.readLine());

        // 네 번째 줄 입력: 찾을 카드 숫자들
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int card = Integer.parseInt(st.nextToken());
            sb.append(haveCard.getOrDefault(card, 0)).append(" ");  // 숫자가 존재하면 개수 반환, 없으면 0 반환
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
