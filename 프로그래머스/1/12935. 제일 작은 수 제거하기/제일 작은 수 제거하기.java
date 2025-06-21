class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = new int[arr.length - 1];
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = min < arr[i] ? min : arr[i];
        }
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min) arr2[index++] = arr[i];
        }
        return arr2;
    }
}
