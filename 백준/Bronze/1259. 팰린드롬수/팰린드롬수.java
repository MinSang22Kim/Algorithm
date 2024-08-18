import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		while (!word.equals("0")) {
			boolean ispalindrome = true;

			for (int i = 0; i < word.length() / 2; i++)
				if (word.charAt(i) != word.charAt(word.length() - 1 - i))
					ispalindrome = false;
			if (ispalindrome)
				System.out.println("yes");
			else
				System.out.println("no");
			word = br.readLine();
		}

	}
}
