import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int S; // 문자열 길이
	static int P; // 부분문자열 길이

	static int answer = 0; // 가능한 비밀번호 개수

	static int checkArr[] = new int[4];
	static int myArr[] = new int[4];
	static char input[] = new char[S]; // 부분 문자열 받는 배열
	static int checkSecret = 0; // 4개의 문자열 중 부분 문자열 모두 탐색했을 때 몇개를 만족하는지(0~4)

	public static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}

	public static void Remove(char c) {
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		S = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		input = br.readLine().toCharArray();

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++; // 0이라는 건 신경안써도
			}
		}

		// 인덱스 0~7까지 8개
		for (int i = 0; i < P; i++) {
			Add(input[i]);
		}

		if (checkSecret == 4)
			answer++;

		// 슬라이딩 윈도우
		// j는 왼쪽 i는 오른쪽(위에서 실행 끝나고 2번째니까 P가 맞음)
		// 한칸 간 8인덱스부터 시작한다는 뜻
		for (int i = P; i < S; i++) {
			int j = i - P;
			Add(input[i]); // 오른쪽 꺼 하나 추가(check과정 포함)
			Remove(input[j]); // 왼쪽 꺼 하나 빼(check과정 포함)
			if (checkSecret == 4)
				answer++;
		}
		System.out.println(answer);
	}
}
