import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = (int) Math.pow(retry(num), 2);
		System.out.printf("%d\n", result);
	}
	public static int retry(int num) {
		if(num == 1)	return 3;
		else return (int) (retry(num-1)+ Math.pow(2, (num-1)));
	}
}