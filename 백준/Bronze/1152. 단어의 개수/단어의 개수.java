import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());

		scan.close();
	}
}
