import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        
        for(int[] info : commands){
            int i = info[0];
            int j = info[1];
            int k = info[2];
            
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[a++] = temp[k-1];
        }
        
        return answer;
    }
}