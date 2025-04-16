import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = Integer.toString(order);
        String[] b = a.split("");
        
        for (int i=0; i<b.length; i++) {
            if (b[i].equals("3") || b[i].equals("6") || b[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}