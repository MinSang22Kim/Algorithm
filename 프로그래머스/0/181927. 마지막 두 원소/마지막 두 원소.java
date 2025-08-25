import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = new ArrayList<>();
        for(int n : numList) list.add(n);
        
        int last = list.get(list.size() - 1);
        int secondLast = list.get(list.size() - 2);
        list.add(secondLast < last ? last - secondLast : 2 * last);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
