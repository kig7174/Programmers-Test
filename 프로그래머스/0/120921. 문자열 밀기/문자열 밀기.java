import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] a = A.split("");
        ArrayDeque<String> deque = new ArrayDeque<>(List.of(a));
        
        for (int i=0; i<A.length(); i++) {
            String b = String.join("", deque);
            
            if (b.equals(B)) return answer;
            
            deque.addFirst(deque.pollLast());
            
            answer++;
        }
        return -1;
    }
}