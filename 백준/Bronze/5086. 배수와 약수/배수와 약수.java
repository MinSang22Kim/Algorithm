import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
		
			if(n1 == 0 && n2 == 0) break;
		
			if(n2 % n1 == 0) {
				System.out.println("factor");
			} else if(n1 % n2 == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}	
	}
}
