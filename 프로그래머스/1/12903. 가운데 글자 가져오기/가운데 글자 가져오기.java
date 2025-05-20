class Solution {
    public String solution(String s) {
        int len = s.length();
        return (len % 2 == 0) 
            ? String.valueOf(s.charAt(len/2 - 1) + "" + s.charAt(len/2)) 
            : String.valueOf(s.charAt(len/2));
    }
}
