class Solution {
    public int solution(long num) {
        int count = 0;
        while(num != 1 && count < 500){
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            count++;
        }
        return (num == 1) ? count : -1;
    }
}
