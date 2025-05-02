class Solution {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] arr = new int[length];
        int i = 0;
        
        while(n > 0){
            arr[i++] = (int)(n % 10);
            n /= 10;
        }
        
        return arr;
    }
}
