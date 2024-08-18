import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		String skills = br.readLine();
		Stack<Character> astack = new Stack<Character>();
		Stack<Character> bstack = new Stack<Character>();

		for (int i = 0; i < skills.length(); i++) {
			char skill = skills.charAt(i);
			if (Character.isDigit(skill))
				cnt++;
			else if (skill == 'L')
				astack.push(skill);
			else if (skill == 'R')
				if (!astack.isEmpty()) {
					astack.pop();
					cnt++;
				} else
					break;
			else if (skill == 'S')
				bstack.push(skill);
			else if (skill == 'K')
				if (!bstack.isEmpty()) {
					bstack.pop();
					cnt++;
				} else
					break;
		}
		System.out.println(cnt);
	}
}
