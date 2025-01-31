class Solution {
    public int solution(int a, int b) {
        int n1 = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int n2 = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
        return (n1 > n2) ? n1 : n2;
    }
}