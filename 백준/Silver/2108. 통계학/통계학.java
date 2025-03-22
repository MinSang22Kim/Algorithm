import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        bw.write(average(numbers) + "\n");
        bw.write(median(numbers) + "\n");
        bw.write(mode(numbers) + "\n");
        bw.write(range(numbers) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    // 평균 (반올림)
    static int average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (int) Math.round((double) sum / arr.length);
    }

    // 중앙값
    static int median(int[] arr) {
        return arr[arr.length / 2];
    }

    // 최빈값
    static int mode(int[] arr) {
        int[] freq = new int[8001]; // -4000 ~ 4000
        int maxFreq = 0;

        for (int num : arr) {
            freq[num + 4000]++;
            maxFreq = Math.max(maxFreq, freq[num + 4000]);
        }

        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i <= 8000; i++) {
            if (freq[i] == maxFreq) {
                modes.add(i - 4000);
            }
        }

        // 두 번째로 작은 값 출력 조건
        return (modes.size() > 1) ? modes.get(1) : modes.get(0);
    }

    // 범위
    static int range(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}
