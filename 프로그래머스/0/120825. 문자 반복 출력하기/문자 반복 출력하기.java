class Solution {
    public String solution(String myString, int n) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            answer += myString.substring(i, i+1).repeat(n);
        }
        return answer;
    }
}