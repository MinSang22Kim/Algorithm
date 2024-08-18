import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int check;
		int[] student = new int[31];
		for(int i=0; i<28; i++) {
			check = scan.nextInt();
			student[check] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
		scan.close();
	}
}
