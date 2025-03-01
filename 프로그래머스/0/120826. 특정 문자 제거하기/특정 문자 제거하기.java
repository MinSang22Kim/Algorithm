class Solution {
    public String solution(String myString, String letter) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (!myString.substring(i, i + 1).equals(letter)) {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}