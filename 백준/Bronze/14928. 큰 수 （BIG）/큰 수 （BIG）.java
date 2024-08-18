import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long remainder =0;
		for(int i=0; i<s.length(); i++) {
			remainder = (remainder*10+(s.charAt(i)-'0'))%20000303;
		}
		System.out.println(remainder);
		scan.close();
	}
}
