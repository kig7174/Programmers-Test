import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<intStrs.length; i++) {
            String a = intStrs[i].substring(s, s + l);
            int b = Integer.parseInt(a);
            
            if (b > k) {
                answer.add(b);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}