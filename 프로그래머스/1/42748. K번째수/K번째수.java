import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;
            
            int[] needSort = new int[end - start + 1];
            int a = 0;
            
            for(int j = start; j <= end; j++){
                needSort[a++] = array[j];
            }
            
            Arrays.sort(needSort);
            answer[i] = needSort[k];
        }
        return answer;
    }
}