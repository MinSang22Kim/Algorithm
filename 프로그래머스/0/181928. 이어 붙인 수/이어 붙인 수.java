class Solution {
    public int solution(int[] numList) {
        StringBuilder evenStr = new StringBuilder();
        StringBuilder oddStr = new StringBuilder();

        for (int i = 0; i < numList.length; i++) {
            if(numList[i] % 2 == 0){
                evenStr.append(numList[i]);
            } else{
                oddStr.append(numList[i]);
            }
        }

        int evenNum = Integer.parseInt(evenStr.toString());
        int oddNum = Integer.parseInt(oddStr.toString());

        return evenNum + oddNum;
    }
}
