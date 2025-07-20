class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            switch(a) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    continue;
                default:
                    sb.append(a);
            }
        }
        return sb.toString();
    }
}
