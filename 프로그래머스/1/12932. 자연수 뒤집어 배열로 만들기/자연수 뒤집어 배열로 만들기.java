class Solution {
    public int[] solution(long n) {
        int[] arr = new int[Long.toString(n).length()];
        int i = 0;
        while(n > 0){
            arr[i++] = (int)(n % 10);
            n /= 10;
        }
        return arr;
    }
}
