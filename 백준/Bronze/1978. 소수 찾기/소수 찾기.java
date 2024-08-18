import java.util.Scanner;

public class Main {
	public static boolean checkDemical(int n) {
		if(n==1) return false;
		if(n==2) return true;
		for(int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int N = scan.nextInt();
		for(int i=0; i<N; i++) {
			int num = scan.nextInt();
			if(checkDemical(num)) cnt++;
		}
		System.out.println(cnt);
		scan.close();
	}
}