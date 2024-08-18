import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			String word = scan.next();
			System.out.print(word.charAt(0));
			System.out.println(word.charAt(word.length()-1));
		}
	}
}
