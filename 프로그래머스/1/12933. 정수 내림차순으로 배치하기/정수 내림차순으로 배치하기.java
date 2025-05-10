import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String sarr: arr) sb.append(sarr);
        return Long.parseLong(sb.reverse().toString());
    }
}
