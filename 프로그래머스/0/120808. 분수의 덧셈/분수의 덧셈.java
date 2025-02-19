class Solution {
    // cf. denominator: 분모
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        // 1. 분자, 분모 통분
        int num = num1 * denom2 + num2 * denom1;
        int denom = denom1 * denom2;
        
        // 2. 최대공약수 GCD(Greatest Common Divisor) 구하기
        int gcd = getGCD(num, denom);
        
        // 3. 배열 형태로 분자, 분모 반환
        return new int[] { num / gcd, denom / gcd };
    }
    
    private int getGCD(int a, int b){
        if(b == 0) return a;
        return getGCD(b, a % b);
    }
}