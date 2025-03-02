class Solution {
    public int[] solution(int[] numList) {
        int[] arr = new int[2];
        
        for(int i = 0; i < numList.length; i++){
            arr[numList[i] % 2]++;
        }
        
        return arr;
    }
}