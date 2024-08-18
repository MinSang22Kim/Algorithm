import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] hambuk = new int[3];
		int[] soda = new int[2];

		for (int i = 0; i < hambuk.length; i++) {
			hambuk[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < soda.length; i++) {
			soda[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(hambuk);
		Arrays.sort(soda);

		bw.write(Integer.toString(hambuk[0] + soda[0] - 50));
		bw.flush();
		bw.close();
	}
}
