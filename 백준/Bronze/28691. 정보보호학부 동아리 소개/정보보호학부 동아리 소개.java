import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		char a = br.readLine().charAt(0);
		switch (a) {
		case 'M':
			sb.append("MatKor");
			break;
		case 'W':
			sb.append("WiCys");
			break;
		case 'C':
			sb.append("CyKor");
			break;
		case 'A':
			sb.append("AlKor");
			break;
		case '$':
			sb.append("$clear");
			break;
		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
		System.out.println(sb);
	}
}
