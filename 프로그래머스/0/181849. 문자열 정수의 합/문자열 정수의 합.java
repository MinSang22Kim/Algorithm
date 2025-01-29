class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
}