package Day9;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();

		System.out.print("정수(-1이 입력될 때까지)>> ");
		while (true) {
			int num = scan.nextInt();
			if (num == -1) {
				System.out.println();
				break;
			}
			v.add(num);
		}
		System.out.println("가장 큰 수는 " + Collections.max(v));
		scan.close();
	}
}