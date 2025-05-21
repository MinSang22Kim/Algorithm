import java.util.Random;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else {
                if (i + 1 >= s.length()) break;
                String sub = s.substring(i, i+2);
                switch(sub){
                    case "ze": sb.append(0); i+=3; break;
                    case "on": sb.append(1); i+=2; break;
                    case "tw": sb.append(2); i+=2; break;
                    case "th": sb.append(3); i+=4; break;
                    case "fo": sb.append(4); i+=3; break;
                    case "fi": sb.append(5); i+=3; break;
                    case "si": sb.append(6); i+=2; break;
                    case "se": sb.append(7); i+=4; break;
                    case "ei": sb.append(8); i+=4; break;
                    case "ni": sb.append(9); i+=3; break;
                    default: break;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
