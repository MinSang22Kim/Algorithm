class Solution {
    public int solution(int a, int b) {
        int m = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int n = 2 * a * b;
        return Math.max(m, n);
    }
}