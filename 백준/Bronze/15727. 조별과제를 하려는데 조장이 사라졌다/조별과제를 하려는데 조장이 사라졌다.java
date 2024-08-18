import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double L = scan.nextDouble();
		if(L%5==0) System.out.println((int)L/5);
		else System.out.println((int)L/5+1);
		scan.close();
	}
}