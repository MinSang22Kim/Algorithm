import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (Character.isLowerCase(c))
				c = Character.toUpperCase(c);
			else if (Character.isUpperCase(c))
				c = Character.toLowerCase(c);
			System.out.print(c);
		}
		
		scan.close();
	}
}
