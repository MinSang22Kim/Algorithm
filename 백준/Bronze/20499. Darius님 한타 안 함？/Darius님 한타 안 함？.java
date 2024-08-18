import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String kda = scan.nextLine();
		String[] kdaArr = kda.split("/");
		if (Integer.parseInt(kdaArr[0]) + Integer.parseInt(kdaArr[2]) < Integer.parseInt(kdaArr[1])
				|| Integer.parseInt(kdaArr[1]) == 0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
		scan.close();
	}
}
