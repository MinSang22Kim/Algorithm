class Solution {

    // 최대공약수(GCD)를 구하는 메서드 (유클리드 호제법)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모 구하기 (LCM = (denom1 * denom2) / GCD)
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);

        // 분자를 공통 분모에 맞춰 변환
        int newNumer1 = numer1 * (lcm / denom1);
        int newNumer2 = numer2 * (lcm / denom2);

        // 두 분자 합치기
        int resultNumer = newNumer1 + newNumer2;

        // 결과 분자와 분모의 최대공약수 구하기
        int commonGCD = gcd(resultNumer, lcm);

        // 기약분수로 만들기
        resultNumer /= commonGCD;
        int resultDenom = lcm / commonGCD;

        // 결과 배열 반환
        return new int[]{resultNumer, resultDenom};
    }

    // 테스트 코드
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result1 = sol.solution(1, 2, 3, 4);  // [5, 4]
        int[] result2 = sol.solution(9, 2, 1, 3);  // [29, 6]

        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}