import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String str = sc.next();
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 대문자인 경우 소문자로 변환
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                // 소문자인 경우 대문자로 변환
                sb.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(sb.toString());
    }
}