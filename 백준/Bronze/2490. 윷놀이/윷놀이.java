import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static char Yutnori(int n) {
		switch (n) {
		case 1: return 'A';
		case 2: return 'B';
		case 3: return 'C';
		case 4: return 'D';
		default: return 'E';
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < 3; i++) {
			int num = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 4; j++) {
				int input = Integer.parseInt(st.nextToken());
				if (input == 0)
					num++;
			}
			bw.write(Character.toString(Yutnori(num)) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
