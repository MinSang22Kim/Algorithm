package Day2;

// 이름, 도시, 나이, 체중, 독신 여부 입력 받고 출력
import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 구분하여 입력");

		String name = scan.next();
		System.out.print("이름은 " + name + ",");

		String city = scan.next();
		System.out.print("도시는 " + city + ",");

		int age = scan.nextInt();
		System.out.print("나이는 " + age + ",");

		double weight = scan.nextDouble();
		System.out.print("체중은 " + weight + ",");

		boolean married = scan.nextBoolean();
		System.out.print("독신 여부는 " + married + "입니다.");

		scan.close();
	}
}
