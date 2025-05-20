class Solution {
    public String solution(String s) {
        int length = s.length();
        int midIndex = length / 2;
        return (length % 2 == 0) 
            ? String.valueOf(s.substring(midIndex - 1 , midIndex + 1)) 
            : String.valueOf(s.charAt(midIndex));
    }
}
