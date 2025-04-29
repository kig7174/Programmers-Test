import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num + 1;
        ArrayList<Integer> a = new ArrayList<>();
        
        for (int i=start_num; i>=end_num; i--) {
            a.add(i);
        }
        
        return a.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}