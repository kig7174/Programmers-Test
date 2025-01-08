import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> a = new ArrayList<>();
        
        for (int b : num_list) {
            a.add(b);
        }
        
        Collections.reverse(a);
        
        return a.stream().mapToInt(i -> i).toArray();
    }
}