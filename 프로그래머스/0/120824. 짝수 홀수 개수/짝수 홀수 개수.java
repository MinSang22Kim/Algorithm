import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        int[] arr = new int[2];
        for(int i = 0; i < numList.length; i++){
            if(numList[i] % 2 == 0) arr[0]++;
            else arr[1]++;
        }
        return arr;
    }
}